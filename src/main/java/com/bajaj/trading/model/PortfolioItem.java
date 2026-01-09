package com.bajaj.trading.model;

public class PortfolioItem {

    private String symbol;
    private int quantity;
    private double averagePrice;

    public PortfolioItem(String symbol, int quantity, double averagePrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.averagePrice = averagePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void addQuantity(int qty, double price) {
        double totalCost = (this.averagePrice * this.quantity) + (price * qty);
        this.quantity += qty;
        this.averagePrice = totalCost / this.quantity;
    }
}
