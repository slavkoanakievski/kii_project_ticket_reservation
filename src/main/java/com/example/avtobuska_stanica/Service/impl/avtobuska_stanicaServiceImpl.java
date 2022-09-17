package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.avtobuska_stanica;
import com.example.avtobuska_stanica.Model.ruta;
import com.example.avtobuska_stanica.Repository.jpa.avtobuska_stanicaRepository;
import com.example.avtobuska_stanica.Service.avtobuska_stanicaService;
import org.springframework.stereotype.Service;

@Service
public class avtobuska_stanicaServiceImpl implements avtobuska_stanicaService {

     private final avtobuska_stanicaRepository avtobuskaStanicaRepository;

    public avtobuska_stanicaServiceImpl(avtobuska_stanicaRepository avtobuskaStanicaRepository) {
        this.avtobuskaStanicaRepository = avtobuskaStanicaRepository;
    }

    @Override
    public avtobuska_stanica findById_stanica(Integer id_stanica) {
        return this.avtobuskaStanicaRepository.findById_stanica(id_stanica);
    }
}
