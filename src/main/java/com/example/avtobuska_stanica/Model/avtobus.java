package com.example.avtobuska_stanica.Model;
import lombok.Data;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "avtobus")
public class avtobus {
    @Id
    private Integer id_avtobus;
    private String tip_avtobus;
    private Integer broj_sedista;
}
