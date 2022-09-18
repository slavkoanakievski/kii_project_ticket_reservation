package com.example.avtobuska_stanica.Model.Views;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "izvestaj_spored_ruta", schema="avtobuskastanica")
public class izvestaj_spored_ruta {

    @Id
    private Integer id_ruta;

    private String ime_ruta;

    private Long broj_kupeni_karti;

    private Long vkupno_mkd;

    private String procent_od_vkupna_uplata;

    public izvestaj_spored_ruta(String ime_ruta, Long broj_kupeni_karti, Long vkupno_mkd, String procent_od_vkupna_uplata) {
        this.ime_ruta = ime_ruta;
        this.broj_kupeni_karti = broj_kupeni_karti;
        this.vkupno_mkd = vkupno_mkd;
        this.procent_od_vkupna_uplata = procent_od_vkupna_uplata;
    }

    public izvestaj_spored_ruta() {
    }

    public Integer getId_ruta() {
        return id_ruta;
    }

    public String getIme_ruta() {
        return ime_ruta;
    }

    public Long getBroj_kupeni_karti() {
        return broj_kupeni_karti;
    }

    public Long getVkupno_mkd() {
        return vkupno_mkd;
    }

    public String getProcent_od_vkupna_uplata() {
        return procent_od_vkupna_uplata;
    }
}
