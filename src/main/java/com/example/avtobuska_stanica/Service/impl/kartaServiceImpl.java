package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.karta;
import com.example.avtobuska_stanica.Repository.jpa.kartaRepository;
import com.example.avtobuska_stanica.Service.kartaService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class kartaServiceImpl implements kartaService {

    private final kartaRepository kartaRepository;

    public kartaServiceImpl(com.example.avtobuska_stanica.Repository.jpa.kartaRepository kartaRepository) {
        this.kartaRepository = kartaRepository;
    }

    @Transactional
    @Override
    public karta save(karta zacuvajKarta) {
        return this.kartaRepository.save(zacuvajKarta);
    }
}
