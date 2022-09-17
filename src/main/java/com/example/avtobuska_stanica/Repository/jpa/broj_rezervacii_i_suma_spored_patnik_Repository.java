package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Views.broj_rezervacii_i_suma_spored_patnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface broj_rezervacii_i_suma_spored_patnik_Repository
        extends JpaRepository<broj_rezervacii_i_suma_spored_patnik, String> {

    @Override
    List<broj_rezervacii_i_suma_spored_patnik> findAll();
}
