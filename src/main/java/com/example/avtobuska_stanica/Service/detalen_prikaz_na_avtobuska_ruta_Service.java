package com.example.avtobuska_stanica.Service;

import com.example.avtobuska_stanica.Model.Views.detalen_prikaz_na_avtobuska_ruta;

import java.util.List;

public interface detalen_prikaz_na_avtobuska_ruta_Service {
    public List<detalen_prikaz_na_avtobuska_ruta> findAll();
    public List<detalen_prikaz_na_avtobuska_ruta> findAllById(Integer id);

}
