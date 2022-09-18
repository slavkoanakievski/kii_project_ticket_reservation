package com.example.avtobuska_stanica.Model.Views;

import com.example.avtobuska_stanica.Model.Composite_Keys.detalen_prikaz_ruta_composite_key;
import com.example.avtobuska_stanica.Model.Composite_Keys.profit_spored_mesec_i_godina_composite_key;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Immutable
@Table(name = "profit_spored_mesec_i_godina", schema="avtobuskastanica")
@IdClass(profit_spored_mesec_i_godina_composite_key.class)
public class profit_spored_mesec_i_godina {

    @Id
    private BigDecimal mesec;

    @Id
    private BigDecimal godina;

    private Long broj_na_rezervacii;

    private Long vkupna_uplata;

    public profit_spored_mesec_i_godina(BigDecimal mesec, BigDecimal godina, Long broj_na_rezervacii, Long vkupna_uplata) {
        this.mesec = mesec;
        this.godina = godina;
        this.broj_na_rezervacii = broj_na_rezervacii;
        this.vkupna_uplata = vkupna_uplata;
    }

    public profit_spored_mesec_i_godina() {
    }

    public BigDecimal getMesec() {
        return mesec;
    }

    public BigDecimal getGodina() {
        return godina;
    }

    public Long getBroj_na_rezervacii() {
        return broj_na_rezervacii;
    }

    public Long getVkupna_uplata() {
        return vkupna_uplata;
    }
}
