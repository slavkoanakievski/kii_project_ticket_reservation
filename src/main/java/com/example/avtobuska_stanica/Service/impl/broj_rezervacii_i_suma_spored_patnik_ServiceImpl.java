package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.broj_rezervacii_i_suma_spored_patnik;
import com.example.avtobuska_stanica.Repository.jpa.broj_rezervacii_i_suma_spored_patnik_Repository;
import com.example.avtobuska_stanica.Service.broj_rezervacii_i_suma_spored_patnik_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class broj_rezervacii_i_suma_spored_patnik_ServiceImpl implements broj_rezervacii_i_suma_spored_patnik_Service {

    private final broj_rezervacii_i_suma_spored_patnik_Repository brojRezervaciiISumaSporedPatnik;

    public broj_rezervacii_i_suma_spored_patnik_ServiceImpl(broj_rezervacii_i_suma_spored_patnik_Repository brojRezervaciiISumaSporedPatnik) {
        this.brojRezervaciiISumaSporedPatnik = brojRezervaciiISumaSporedPatnik;
    }


    @Override
    public List<broj_rezervacii_i_suma_spored_patnik> findAll() {
        return this.brojRezervaciiISumaSporedPatnik.findAll();
    }
}
