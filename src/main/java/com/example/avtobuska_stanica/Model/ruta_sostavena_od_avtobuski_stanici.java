package com.example.avtobuska_stanica.Model;


import com.example.avtobuska_stanica.Model.Composite_Keys.RutaAvtobuskaKey;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "ruta_sostavena_od_avtobuski_stanici", schema="avtobuskastanica")
public class ruta_sostavena_od_avtobuski_stanici {
    @EmbeddedId
    RutaAvtobuskaKey id;

    @ManyToOne
    @MapsId("id_ruta")
    @JoinColumn(name = "id_ruta")
    ruta id_ruta;

    @ManyToOne
    @MapsId("id_stanica")
    @JoinColumn(name = "id_stanica")
    ruta id_stanica;

    Integer reden_broj;
}
