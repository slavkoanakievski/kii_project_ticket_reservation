package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Views.procent_mazi_i_zeni_patuvanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface procent_mazi_i_zeni_patuvanja_Repository extends JpaRepository<procent_mazi_i_zeni_patuvanja, String> {
    @Override
    List<procent_mazi_i_zeni_patuvanja> findAll();
}
