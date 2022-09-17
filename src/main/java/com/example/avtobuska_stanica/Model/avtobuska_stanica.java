package com.example.avtobuska_stanica.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "avtobuska_stanica")
public class avtobuska_stanica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_stanica;

    private String ime_stanica;

    private String grad;

    @OneToMany(mappedBy = "id_stanica")
    List<ruta_sostavena_od_avtobuski_stanici> ruta_sostavena_od_avtobuski_stanici;
}
