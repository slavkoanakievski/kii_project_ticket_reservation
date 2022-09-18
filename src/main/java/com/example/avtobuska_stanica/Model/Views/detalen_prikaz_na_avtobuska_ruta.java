package com.example.avtobuska_stanica.Model.Views;

import com.example.avtobuska_stanica.Model.Composite_Keys.detalen_prikaz_ruta_composite_key;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Immutable
@Table(name = "detalen_prikaz_na_avtobuska_ruta", schema="avtobuskastanica")
@IdClass(detalen_prikaz_ruta_composite_key.class)
public class detalen_prikaz_na_avtobuska_ruta {
    @Id
    private Integer id_stanica;
    @Id
    private Integer id_ruta;


    private String ime_ruta;
    private Integer cena_karta;
    private LocalDateTime vreme_trgnuvanje;
    private LocalDateTime vreme_pristignuvanje;
    private String vremetraenje_na_vozenjeto;
    private String broj_na_zapiranja;

    public Integer getId_stanica() {
        return id_stanica;
    }

    public Integer getId_ruta() {
        return id_ruta;
    }

    public String getIme_ruta() {
        return ime_ruta;
    }

    public Integer getCena_karta() {
        return cena_karta;
    }

    public LocalDateTime getVreme_trgnuvanje() {
        return vreme_trgnuvanje;
    }

    public LocalDateTime getVreme_pristignuvanje() {
        return vreme_pristignuvanje;
    }

    public String getVremetraenje_na_vozenjeto() {
        return vremetraenje_na_vozenjeto;
    }

    public String getBroj_na_zapiranja() {
        return broj_na_zapiranja;
    }
}
