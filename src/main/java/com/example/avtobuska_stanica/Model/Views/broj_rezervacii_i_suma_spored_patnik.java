package com.example.avtobuska_stanica.Model.Views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "broj_rezervacii_i_suma_spored_patnik")
public class broj_rezervacii_i_suma_spored_patnik {

    @Id
    private String patnik_embg;

    private String ime_patnik;

    private Long broj_na_rezervacii;

    private Long vkupno_uplata;


    public broj_rezervacii_i_suma_spored_patnik() {
    }

    public String getPatnik_embg() {
        return patnik_embg;
    }

    public String getIme_patnik() {
        return ime_patnik;
    }

    public Long getBroj_na_rezervacii() {
        return broj_na_rezervacii;
    }

    public Long getVkupno_uplata() {
        return vkupno_uplata;
    }
}

