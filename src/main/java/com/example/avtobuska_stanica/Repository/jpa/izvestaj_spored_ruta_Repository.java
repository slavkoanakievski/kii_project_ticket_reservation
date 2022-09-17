package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Views.izvestaj_spored_ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface izvestaj_spored_ruta_Repository extends JpaRepository<izvestaj_spored_ruta, Integer > {
    @Override
    List<izvestaj_spored_ruta> findAll();
}
