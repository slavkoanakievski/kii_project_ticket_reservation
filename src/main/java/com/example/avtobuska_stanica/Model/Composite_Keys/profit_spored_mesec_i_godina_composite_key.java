package com.example.avtobuska_stanica.Model.Composite_Keys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class profit_spored_mesec_i_godina_composite_key implements Serializable {

    private BigDecimal mesec;

    private BigDecimal godina;

    public profit_spored_mesec_i_godina_composite_key(BigDecimal mesec, BigDecimal godina) {
        this.mesec = mesec;
        this.godina = godina;
    }

    public profit_spored_mesec_i_godina_composite_key() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        profit_spored_mesec_i_godina_composite_key that = (profit_spored_mesec_i_godina_composite_key) o;
        return Objects.equals(mesec, that.mesec) && Objects.equals(godina, that.godina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesec, godina);
    }
}
