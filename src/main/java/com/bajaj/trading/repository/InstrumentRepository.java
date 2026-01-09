package com.bajaj.trading.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bajaj.trading.model.Instrument;

@Repository
public class InstrumentRepository {

    private final List<Instrument> instruments = new ArrayList<>();

    public InstrumentRepository() {
        instruments.add(new Instrument("RELIANCE", "NSE", "EQUITY", 2450.50));
        instruments.add(new Instrument("TCS", "NSE", "EQUITY", 3650.75));
        instruments.add(new Instrument("INFY", "NSE", "EQUITY", 1520.30));
    }

    public List<Instrument> getAllInstruments() {
        return instruments;
    }
}
