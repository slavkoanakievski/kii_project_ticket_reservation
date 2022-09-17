package com.example.avtobuska_stanica.Model.Views;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "procent_mazi_i_zeni_patuvanja")
public class procent_mazi_i_zeni_patuvanja {

    @Id
    private String pol_patnik;

    private String procent_od_vkupen_broj_patuvanja;

    private String procent_od_vkupno_uplatena_suma;

    public procent_mazi_i_zeni_patuvanja(String pol_patnik, String procent_od_vkupen_broj_patuvanja, String procent_od_vkupno_uplatena_suma) {
        this.pol_patnik = pol_patnik;
        this.procent_od_vkupen_broj_patuvanja = procent_od_vkupen_broj_patuvanja;
        this.procent_od_vkupno_uplatena_suma = procent_od_vkupno_uplatena_suma;
    }

    public procent_mazi_i_zeni_patuvanja() {

    }

    public String getPol_patnik() {
        return pol_patnik;
    }

    public String getProcent_od_vkupen_broj_patuvanja() {
        return procent_od_vkupen_broj_patuvanja;
    }

    public String getProcent_od_vkupno_uplatena_suma() {
        return procent_od_vkupno_uplatena_suma;
    }
}
