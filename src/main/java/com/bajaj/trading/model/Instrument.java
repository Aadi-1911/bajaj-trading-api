package com.bajaj.trading.model;

public class Instrument {
    
    private String symbol;
    private String exchange;
    private String instrumentType;
    private double lastTradedPrice;

    public Instrument(String symbol, String exchange, String instrumentType, double lastTradedPrice) {
        this.symbol = symbol;
        this.exchange = exchange;
        this.instrumentType = instrumentType;
        this.lastTradedPrice = lastTradedPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getExchange() {
        return exchange;
    }
    public String getInstrumentType() {
        return instrumentType;
    }

    public double getLastTradedPrice() {
        return lastTradedPrice;
    }
}