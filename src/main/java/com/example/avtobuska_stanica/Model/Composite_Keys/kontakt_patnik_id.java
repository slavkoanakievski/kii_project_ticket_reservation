package com.example.avtobuska_stanica.Model.Composite_Keys;

import java.io.Serializable;
import java.util.Objects;

public class kontakt_patnik_id implements Serializable {

    private char embg;

    private String kontakt_patnik;

    public kontakt_patnik_id(char embg, String kontakt_patnik) {
        this.embg = embg;
        this.kontakt_patnik = kontakt_patnik;
    }

    public kontakt_patnik_id() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        kontakt_patnik_id that = (kontakt_patnik_id) o;
        return embg == that.embg && Objects.equals(kontakt_patnik, that.kontakt_patnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg, kontakt_patnik);
    }
}
