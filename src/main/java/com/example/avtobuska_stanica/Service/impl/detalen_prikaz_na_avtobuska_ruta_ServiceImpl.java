package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.detalen_prikaz_na_avtobuska_ruta;
import com.example.avtobuska_stanica.Repository.jpa.detalen_prikaz_na_avtobuska_ruta_Repository;
import com.example.avtobuska_stanica.Service.detalen_prikaz_na_avtobuska_ruta_Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class detalen_prikaz_na_avtobuska_ruta_ServiceImpl implements detalen_prikaz_na_avtobuska_ruta_Service {


    private final detalen_prikaz_na_avtobuska_ruta_Repository detalenPrikazNaAvtobuskaRutaRepository;

    public detalen_prikaz_na_avtobuska_ruta_ServiceImpl(detalen_prikaz_na_avtobuska_ruta_Repository detalenPrikazNaAvtobuskaRutaRepository) {
        this.detalenPrikazNaAvtobuskaRutaRepository = detalenPrikazNaAvtobuskaRutaRepository;
    }



    @Override
    public List<detalen_prikaz_na_avtobuska_ruta> findAll() {
    return detalenPrikazNaAvtobuskaRutaRepository.findAll();
    }

    @Override
    public List<detalen_prikaz_na_avtobuska_ruta> findAllById(Integer id) {
      return detalenPrikazNaAvtobuskaRutaRepository.findAll().stream()
              .filter(i->i.getId_stanica().equals(id)).collect(Collectors.toList());
    }


}
