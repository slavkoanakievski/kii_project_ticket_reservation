package com.example.avtobuska_stanica.Model.Views;

import com.example.avtobuska_stanica.Model.Composite_Keys.detalen_prikaz_karta_info_composite_key;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Immutable
@Table(name = "pogled_napravena_rezervacija_od_patnik")
@IdClass(detalen_prikaz_karta_info_composite_key.class)
public class pogled_napravena_rezervacija_od_patnik {

    @Id
    private String embg;

    @Id
    private Integer id_karta;

    private String ime_patnik;

    private char pol_patnik;

    private String kontakt_patnik;

    private Integer broj_sedste;

    private String patuva_od;

    private String patuva_do;

    private Integer cena_karta;

    private LocalDateTime vreme_trgnuvanje;

    private LocalDateTime vreme_pristignuvanje;


    public String getEmbg() {
        return embg;
    }

    public Integer getId_karta() {
        return id_karta;
    }

    public String getIme_patnik() {
        return ime_patnik;
    }

    public char getPol_patnik() {
        return pol_patnik;
    }

    public String getKontakt_patnik() {
        return kontakt_patnik;
    }

    public Integer getBroj_sedste() {
        return broj_sedste;
    }

    public String getPatuva_od() {
        return patuva_od;
    }

    public String getPatuva_do() {
        return patuva_do;
    }

    public LocalDateTime getVreme_trgnuvanje() {
        return vreme_trgnuvanje;
    }

    public LocalDateTime getVreme_pristignuvanje() {
        return vreme_pristignuvanje;
    }

    public pogled_napravena_rezervacija_od_patnik() {
    }

    public Integer getCena_karta() {
        return cena_karta;
    }
}
