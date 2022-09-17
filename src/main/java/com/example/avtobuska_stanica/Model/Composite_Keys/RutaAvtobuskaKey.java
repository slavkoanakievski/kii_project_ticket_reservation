package com.example.avtobuska_stanica.Model.Composite_Keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RutaAvtobuskaKey implements Serializable {

    @Column(name = "id_ruta")
    Integer id_ruta;

    @Column(name = "id_stanica")
    Integer id_stanica;

    public RutaAvtobuskaKey(Integer id_ruta, Integer id_stanica) {
        this.id_ruta = id_ruta;
        this.id_stanica = id_stanica;
    }

    public RutaAvtobuskaKey() {
    }
}
