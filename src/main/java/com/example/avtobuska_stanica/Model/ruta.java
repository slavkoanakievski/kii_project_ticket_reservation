package com.example.avtobuska_stanica.Model;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ruta", schema="avtobuskastanica")
public class ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_ruta;

    private String ime_ruta;

    private LocalDateTime vreme_trgnuvanje;

    private LocalDateTime vreme_pristignuvanje;

    @ManyToOne
    @JoinColumn(name="id_avtobus", nullable = true)
    private avtobus id_avtobus;

    @OneToMany(mappedBy = "id_ruta")
    List<ruta_sostavena_od_avtobuski_stanici> ruta_sostavena_od_avtobuski_stanici;

    public ruta(String ime_ruta, LocalDateTime vreme_trgnuvanje, LocalDateTime vreme_pristignuvanje, avtobus id_avtobus, List<com.example.avtobuska_stanica.Model.ruta_sostavena_od_avtobuski_stanici> ruta_sostavena_od_avtobuski_stanici) {
        this.ime_ruta = ime_ruta;
        this.vreme_trgnuvanje = vreme_trgnuvanje;
        this.vreme_pristignuvanje = vreme_pristignuvanje;
        this.id_avtobus = id_avtobus;
        this.ruta_sostavena_od_avtobuski_stanici = ruta_sostavena_od_avtobuski_stanici;
    }

    public ruta() {
    }

    public Integer getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(Integer id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getIme_ruta() {
        return ime_ruta;
    }

    public void setIme_ruta(String ime_ruta) {
        this.ime_ruta = ime_ruta;
    }

    public LocalDateTime getVreme_trgnuvanje() {
        return vreme_trgnuvanje;
    }

    public void setVreme_trgnuvanje(LocalDateTime vreme_trgnuvanje) {
        this.vreme_trgnuvanje = vreme_trgnuvanje;
    }

    public LocalDateTime getVreme_pristignuvanje() {
        return vreme_pristignuvanje;
    }

    public void setVreme_pristignuvanje(LocalDateTime vreme_pristignuvanje) {
        this.vreme_pristignuvanje = vreme_pristignuvanje;
    }

    public avtobus getId_avtobus() {
        return id_avtobus;
    }

    public void setId_avtobus(avtobus id_avtobus) {
        this.id_avtobus = id_avtobus;
    }

    public List<com.example.avtobuska_stanica.Model.ruta_sostavena_od_avtobuski_stanici> getRuta_sostavena_od_avtobuski_stanici() {
        return ruta_sostavena_od_avtobuski_stanici;
    }

    public void setRuta_sostavena_od_avtobuski_stanici(List<com.example.avtobuska_stanica.Model.ruta_sostavena_od_avtobuski_stanici> ruta_sostavena_od_avtobuski_stanici) {
        this.ruta_sostavena_od_avtobuski_stanici = ruta_sostavena_od_avtobuski_stanici;
    }
}
