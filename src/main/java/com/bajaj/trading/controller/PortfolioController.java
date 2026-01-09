package com.bajaj.trading.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.trading.model.PortfolioItem;
import com.bajaj.trading.repository.PortfolioRepository;

@RestController
@RequestMapping("/api/v1/portfolio")
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @GetMapping
    public Collection<PortfolioItem> getPortfolio() {
        return portfolioRepository.getPortfolio();
    }
}
