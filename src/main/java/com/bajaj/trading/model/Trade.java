package com.bajaj.trading.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Trade {

    private String tradeId;
    private String orderId;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDateTime executedAt;

    public Trade(String orderId, String symbol, int quantity, double price) {
        this.tradeId = UUID.randomUUID().toString();
        this.orderId = orderId;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.executedAt = LocalDateTime.now();
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }
}
