package com.bajaj.trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.trading.model.Order;
import com.bajaj.trading.model.Trade;
import com.bajaj.trading.repository.OrderRepository;
import com.bajaj.trading.repository.PortfolioRepository;
import com.bajaj.trading.repository.TradeRepository;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderRepository orderRepository;
    private final TradeRepository tradeRepository;
    private final PortfolioRepository portfolioRepository;

    public OrderController(OrderRepository orderRepository,
                           TradeRepository tradeRepository,
                           PortfolioRepository portfolioRepository) {
        this.orderRepository = orderRepository;
        this.tradeRepository = tradeRepository;
        this.portfolioRepository = portfolioRepository;
    }

    @PostMapping
    public Order placeOrder(@RequestBody OrderRequest request) {

        if (request.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }

        Order order = new Order(
                request.getSymbol(),
                request.getOrderType(),
                request.getOrderStyle(),
                request.getQuantity(),
                request.getPrice()
        );

        order.setStatus("EXECUTED");
        orderRepository.save(order);

        double execPrice = request.getPrice() != null ? request.getPrice() : 0.0;

        Trade trade = new Trade(
                order.getOrderId(),
                order.getSymbol(),
                order.getQuantity(),
                execPrice
        );
        tradeRepository.save(trade);

        // ✅ Update portfolio on BUY
        if ("BUY".equalsIgnoreCase(order.getOrderType())) {
            portfolioRepository.updatePortfolio(
                    order.getSymbol(),
                    order.getQuantity(),
                    execPrice
            );
        }

        return order;
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable String orderId) {
        return orderRepository.findById(orderId);
    }
}
