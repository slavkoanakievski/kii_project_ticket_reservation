package com.example.avtobuska_stanica.Model.Views;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class lista_site_avtobuski_stanici {

    @Id
    private Integer id_stanica;
    private String ime_stanica;
    private String grad;

    public Integer getId_stanica() {
        return id_stanica;
    }

    public String getIme_stanica() {
        return ime_stanica;
    }

    public String getGrad() {
        return grad;
    }
}
