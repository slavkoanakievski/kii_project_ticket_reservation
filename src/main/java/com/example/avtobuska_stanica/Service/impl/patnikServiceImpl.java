package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.exceptions.InvalidPatnikEmbgException;
import com.example.avtobuska_stanica.Model.patnik;
import com.example.avtobuska_stanica.Service.patnikService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class patnikServiceImpl implements patnikService {

    private final com.example.avtobuska_stanica.Repository.jpa.patnikRepository patnikRepository;

    public patnikServiceImpl(com.example.avtobuska_stanica.Repository.jpa.patnikRepository patnikRepository) {
        this.patnikRepository = patnikRepository;
    }

    @Override
    public Optional<patnik> findById(String embg) {
        return Optional.ofNullable(this.patnikRepository.findById(embg)
                .orElseThrow(() -> new InvalidPatnikEmbgException(embg)));
    }

    @Override
    public List<patnik> findAll() {
        return this.patnikRepository.findAll();
    }

    @Transactional
    @Override
    public <S extends patnik> S save(S p) {
        return this.patnikRepository.save(p);
    }
}
