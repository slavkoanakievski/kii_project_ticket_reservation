package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.ruta;
import com.example.avtobuska_stanica.Repository.jpa.rutaRepository;
import com.example.avtobuska_stanica.Service.rutaService;
import org.springframework.stereotype.Service;

@Service
public class rutaServiceImplementation implements rutaService {

    private final rutaRepository rutaRepository;

    public rutaServiceImplementation(com.example.avtobuska_stanica.Repository.jpa.rutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    @Override
    public ruta findById_ruta(Integer id_ruta) {
        return this.rutaRepository.findById_ruta(id_ruta);
    }
}
