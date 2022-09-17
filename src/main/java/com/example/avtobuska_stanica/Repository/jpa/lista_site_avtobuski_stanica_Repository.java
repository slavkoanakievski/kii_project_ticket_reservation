package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Views.lista_site_avtobuski_stanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface lista_site_avtobuski_stanica_Repository extends JpaRepository<lista_site_avtobuski_stanici, Integer> {
    @Override
    List<lista_site_avtobuski_stanici> findAll();
}
