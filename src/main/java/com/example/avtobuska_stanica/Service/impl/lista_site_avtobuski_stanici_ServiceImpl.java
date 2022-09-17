package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.lista_site_avtobuski_stanici;
import com.example.avtobuska_stanica.Repository.jpa.lista_site_avtobuski_stanica_Repository;
import com.example.avtobuska_stanica.Service.lista_site_avtobuski_stanici_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lista_site_avtobuski_stanici_ServiceImpl implements lista_site_avtobuski_stanici_Service {

    private final lista_site_avtobuski_stanica_Repository listaSiteAvtobuskiStanicaRepository;

    public lista_site_avtobuski_stanici_ServiceImpl(lista_site_avtobuski_stanica_Repository listaSiteAvtobuskiStanicaRepository) {
        this.listaSiteAvtobuskiStanicaRepository = listaSiteAvtobuskiStanicaRepository;
    }

    @Override
    public List<lista_site_avtobuski_stanici> findAll() {
        return listaSiteAvtobuskiStanicaRepository.findAll();
    }
}
