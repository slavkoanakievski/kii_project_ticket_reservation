package com.example.avtobuska_stanica.Service.impl;

import com.example.avtobuska_stanica.Model.Views.pogled_napravena_rezervacija_od_patnik;
import com.example.avtobuska_stanica.Repository.jpa.pogled_napravena_rezervacija_od_patnik_Repository;
import com.example.avtobuska_stanica.Service.pogled_napravena_rezervacija_od_patnik_Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class pogled_napravena_rezervacija_od_patnik_ServiceImpl implements pogled_napravena_rezervacija_od_patnik_Service {

    private final pogled_napravena_rezervacija_od_patnik_Repository pogledNapravenaRezervacijaOdPatnikRepository;

    public pogled_napravena_rezervacija_od_patnik_ServiceImpl(pogled_napravena_rezervacija_od_patnik_Repository pogledNapravenaRezervacijaOdPatnikRepository) {
        this.pogledNapravenaRezervacijaOdPatnikRepository = pogledNapravenaRezervacijaOdPatnikRepository;
    }


    @Override
    public List<pogled_napravena_rezervacija_od_patnik> findAll() {
        return this.pogledNapravenaRezervacijaOdPatnikRepository.findAll();
    }

    @Override
    public List<pogled_napravena_rezervacija_od_patnik> findAllByGivenEMBG(String embg) {
        return this.pogledNapravenaRezervacijaOdPatnikRepository
                .findAllByGivenEMBG(embg);
    }

    @Override
    public List<pogled_napravena_rezervacija_od_patnik> findAllByGivenEMBGAndTicket(String embg, Integer id_karta) {
        return this.pogledNapravenaRezervacijaOdPatnikRepository.findAllByEmbgAndId_karta(embg, id_karta);

    }
}
