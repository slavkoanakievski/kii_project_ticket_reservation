package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.profit_spored_mesec_i_godina;
import com.example.avtobuska_stanica.Repository.jpa.profit_spored_mesec_i_godina_Repository;
import com.example.avtobuska_stanica.Service.profit_spored_mesec_i_godina_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class profit_spored_mesec_i_godina_ServiceImpl implements profit_spored_mesec_i_godina_Service {

    private final profit_spored_mesec_i_godina_Repository profitSporedMesecIGodinaRepository;

    public profit_spored_mesec_i_godina_ServiceImpl(profit_spored_mesec_i_godina_Repository profitSporedMesecIGodinaRepository) {
        this.profitSporedMesecIGodinaRepository = profitSporedMesecIGodinaRepository;
    }

    @Override
    public List<profit_spored_mesec_i_godina> findAll() {
        return this.profitSporedMesecIGodinaRepository.findAll();
    }
}
