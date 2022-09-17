package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.izvestaj_spored_ruta;
import com.example.avtobuska_stanica.Repository.jpa.izvestaj_spored_ruta_Repository;
import com.example.avtobuska_stanica.Service.izvestaj_spored_ruta_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class izvestaj_spored_ruta_ServiceImpl implements izvestaj_spored_ruta_Service {

    private final izvestaj_spored_ruta_Repository izvestajSporedRutaRepository;

    public izvestaj_spored_ruta_ServiceImpl(izvestaj_spored_ruta_Repository izvestajSporedRutaRepository) {
        this.izvestajSporedRutaRepository = izvestajSporedRutaRepository;
    }

    @Override
    public List<izvestaj_spored_ruta> findAll() {
        return this.izvestajSporedRutaRepository.findAll();
    }
}
