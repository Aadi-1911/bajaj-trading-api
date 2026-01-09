package com.bajaj.trading.model;

import java.util.UUID;

public class Order {

    private String orderId;
    private String symbol;
    private String orderType;   // BUY or SELL
    private String orderStyle;  // MARKET or LIMIT
    private int quantity;
    private Double price;       // nullable for MARKET
    private String status;      // NEW, EXECUTED, CANCELLED

    public Order(String symbol, String orderType, String orderStyle, int quantity, Double price) {
        this.orderId = UUID.randomUUID().toString();
        this.symbol = symbol;
        this.orderType = orderType;
        this.orderStyle = orderStyle;
        this.quantity = quantity;
        this.price = price;
        this.status = "NEW";
    }

    public String getOrderId() {
        return orderId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getOrderStyle() {
        return orderStyle;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
