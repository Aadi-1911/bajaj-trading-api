package com.bajaj.trading.repository;

import com.bajaj.trading.model.PortfolioItem;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PortfolioRepository {

    private final Map<String, PortfolioItem> portfolio = new HashMap<>();

    public void updatePortfolio(String symbol, int quantity, double price) {

        PortfolioItem item = portfolio.get(symbol);

        if (item == null) {
            portfolio.put(symbol, new PortfolioItem(symbol, quantity, price));
        } else {
            item.addQuantity(quantity, price);
        }
    }

    public Collection<PortfolioItem> getPortfolio() {
        return portfolio.values();
    }
}

