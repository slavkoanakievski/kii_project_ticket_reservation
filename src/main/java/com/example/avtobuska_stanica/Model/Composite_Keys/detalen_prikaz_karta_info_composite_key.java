package com.example.avtobuska_stanica.Model.Composite_Keys;

import java.io.Serializable;
import java.util.Objects;

public class detalen_prikaz_karta_info_composite_key implements Serializable {

    private String embg;

    private Integer id_karta;

    public detalen_prikaz_karta_info_composite_key(String embg, Integer id_karta) {
        this.embg = embg;
        this.id_karta = id_karta;
    }

    public detalen_prikaz_karta_info_composite_key() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        detalen_prikaz_karta_info_composite_key that = (detalen_prikaz_karta_info_composite_key) o;
        return Objects.equals(embg, that.embg) && Objects.equals(id_karta, that.id_karta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg, id_karta);
    }
}
