package com.example.avtobuska_stanica.Model.Composite_Keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RutaAvtobuskaKey that = (RutaAvtobuskaKey) o;
        return Objects.equals(id_ruta, that.id_ruta) && Objects.equals(id_stanica, that.id_stanica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ruta, id_stanica);
    }
}
