package com.example.avtobuska_stanica.Model.Composite_Keys;

import java.io.Serializable;
import java.util.Objects;

public class detalen_prikaz_ruta_composite_key implements Serializable {

    private Integer id_stanica;

    private Integer id_ruta;

    public detalen_prikaz_ruta_composite_key(Integer id_stanica, Integer id_ruta) {
        this.id_stanica = id_stanica;
        this.id_ruta = id_ruta;
    }

    public detalen_prikaz_ruta_composite_key() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        detalen_prikaz_ruta_composite_key that = (detalen_prikaz_ruta_composite_key) o;
        return id_stanica.equals(that.id_stanica) && id_ruta.equals(that.id_ruta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_stanica, id_ruta);
    }
}
