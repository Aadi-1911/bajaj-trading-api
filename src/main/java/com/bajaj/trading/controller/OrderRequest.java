package com.bajaj.trading.controller;

public class OrderRequest {

    private String symbol;
    private String orderType;
    private String orderStyle;
    private int quantity;
    private Double price;

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
}
