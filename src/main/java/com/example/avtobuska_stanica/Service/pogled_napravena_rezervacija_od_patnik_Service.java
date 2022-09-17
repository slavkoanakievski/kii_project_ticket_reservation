package com.example.avtobuska_stanica.Service;

import com.example.avtobuska_stanica.Model.Composite_Keys.detalen_prikaz_karta_info_composite_key;
import com.example.avtobuska_stanica.Model.Views.pogled_napravena_rezervacija_od_patnik;

import java.util.List;

public interface pogled_napravena_rezervacija_od_patnik_Service {

    List<pogled_napravena_rezervacija_od_patnik> findAll();

    List<pogled_napravena_rezervacija_od_patnik> findAllByGivenEMBG(String embg);

    List<pogled_napravena_rezervacija_od_patnik> findAllByGivenEMBGAndTicket(String embg, Integer id_karta);
}
