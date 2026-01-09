package com.bajaj.trading.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.trading.model.Instrument;
import com.bajaj.trading.repository.InstrumentRepository;

@RestController
@RequestMapping("/api/v1/instruments")
public class InstrumentController {

    private final InstrumentRepository instrumentRepository;

    public InstrumentController(InstrumentRepository instrumentRepository) {
        this.instrumentRepository = instrumentRepository;
    }

    @GetMapping
    public List<Instrument> getAllInstruments() {
        return instrumentRepository.getAllInstruments();
    }
}
