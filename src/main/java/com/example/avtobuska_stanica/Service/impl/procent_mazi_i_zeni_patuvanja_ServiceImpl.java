package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.procent_mazi_i_zeni_patuvanja;
import com.example.avtobuska_stanica.Repository.jpa.procent_mazi_i_zeni_patuvanja_Repository;
import com.example.avtobuska_stanica.Service.procent_mazi_i_zeni_patuvanja_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class procent_mazi_i_zeni_patuvanja_ServiceImpl implements procent_mazi_i_zeni_patuvanja_Service {

   private final procent_mazi_i_zeni_patuvanja_Repository procentMaziIZeniPatuvanjaRepository;

    public procent_mazi_i_zeni_patuvanja_ServiceImpl(procent_mazi_i_zeni_patuvanja_Repository procentMaziIZeniPatuvanjaRepository) {
        this.procentMaziIZeniPatuvanjaRepository = procentMaziIZeniPatuvanjaRepository;
    }

    @Override
    public List<procent_mazi_i_zeni_patuvanja> findAll() {
        return this.procentMaziIZeniPatuvanjaRepository.findAll();
    }

}
