package com.example.avtobuska_stanica.Repository.jpa;

import com.example.avtobuska_stanica.Model.Composite_Keys.detalen_prikaz_karta_info_composite_key;
import com.example.avtobuska_stanica.Model.Views.pogled_napravena_rezervacija_od_patnik;
import com.example.avtobuska_stanica.Model.avtobuska_stanica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface pogled_napravena_rezervacija_od_patnik_Repository extends JpaRepository<pogled_napravena_rezervacija_od_patnik, detalen_prikaz_karta_info_composite_key> {

    @Override
    List<pogled_napravena_rezervacija_od_patnik> findAll();

    @Query("SELECT a FROM pogled_napravena_rezervacija_od_patnik a WHERE a.id_karta = :id_karta and a.embg = :embg")
    List<pogled_napravena_rezervacija_od_patnik> findAllByEmbgAndId_karta(@Param("embg") String embg, @Param("id_karta") Integer id_karta);

    @Query("SELECT a FROM pogled_napravena_rezervacija_od_patnik a WHERE a.embg = :embg")
    List<pogled_napravena_rezervacija_od_patnik> findAllByGivenEMBG(String embg);
}
