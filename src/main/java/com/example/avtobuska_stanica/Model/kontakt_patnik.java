package com.example.avtobuska_stanica.Model;

import com.example.avtobuska_stanica.Model.Composite_Keys.kontakt_patnik_id;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@IdClass(kontakt_patnik_id.class)
@Table(name = "kontakt_patnik")
public class kontakt_patnik {
    @Id
    @ManyToOne
    @JoinColumn(name = "embg", nullable = true, columnDefinition = "varchar2")
    private patnik embg;

    @Id
    private String kontakt_patnik;

    public kontakt_patnik(patnik embg, String kontakt_patnik) {
        this.embg = embg;
        this.kontakt_patnik = kontakt_patnik;
    }

    public kontakt_patnik() {

    }
}
