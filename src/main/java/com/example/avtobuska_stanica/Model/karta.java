package com.example.avtobuska_stanica.Model;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "karta", schema="avtobuskastanica")
public class karta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_karta;

    private Integer broj_sedste;

    private Integer cena_karta;

    private String patuva_od;

    private String patuva_do;

    @ManyToOne
    @JoinColumn(name="embg_patnik", nullable = true)
    private patnik embg_patnik;

    @ManyToOne
    @JoinColumn(name="id_stanica_se_kacuva", nullable = false)
    private avtobuska_stanica id_stanica_se_kacuva;

    @ManyToOne
    @JoinColumn(name="id_stanica_se_simnuva", nullable = false)
    private avtobuska_stanica id_stanica_se_simnuva;

    @ManyToOne
    @JoinColumn(name="id_ruta", nullable = false)
    private ruta id_ruta;



    public karta() {

    }

    public karta(Integer broj_sedste, Integer cena_karta, String patuva_od, String patuva_do, patnik embg_patnik, avtobuska_stanica id_stanica_se_kacuva, avtobuska_stanica id_stanica_se_simnuva, ruta id_ruta) {
        this.broj_sedste = broj_sedste;
        this.cena_karta = cena_karta;
        this.patuva_od = patuva_od;
        this.patuva_do = patuva_do;
        this.embg_patnik = embg_patnik;
        this.id_stanica_se_kacuva = id_stanica_se_kacuva;
        this.id_stanica_se_simnuva = id_stanica_se_simnuva;
        this.id_ruta = id_ruta;
    }
}
