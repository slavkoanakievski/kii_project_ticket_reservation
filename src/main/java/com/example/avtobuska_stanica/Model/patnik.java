package com.example.avtobuska_stanica.Model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patnik", schema="avtobuskastanica")
public class patnik {
    @Id
    private String embg;

    private String ime_patnik;

    private char pol_patnik;

    public patnik(String embg, String ime_patnik, char pol_patnik) {
        this.embg = embg;
        this.ime_patnik = ime_patnik;
        this.pol_patnik = pol_patnik;
    }

    public patnik() {

    }

    public String getEmbg() {
        return embg;
    }

    public String getIme_patnik() {
        return ime_patnik;
    }

    public char getPol_patnik() {
        return pol_patnik;
    }
}
