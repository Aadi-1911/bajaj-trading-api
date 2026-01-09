package com.bajaj.trading.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bajaj.trading.model.Trade;

@Repository
public class TradeRepository {

    private final List<Trade> trades = new ArrayList<>();

    public void save(Trade trade) {
        trades.add(trade);
    }

    public List<Trade> findAll() {
        return trades;
    }
}
