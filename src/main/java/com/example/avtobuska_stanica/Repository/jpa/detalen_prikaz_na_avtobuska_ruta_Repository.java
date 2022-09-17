package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Views.detalen_prikaz_na_avtobuska_ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface detalen_prikaz_na_avtobuska_ruta_Repository extends JpaRepository<detalen_prikaz_na_avtobuska_ruta, Integer> {
    @Override
    List<detalen_prikaz_na_avtobuska_ruta> findAll();


}
