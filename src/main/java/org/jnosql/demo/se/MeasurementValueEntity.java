package org.jnosql.demo.se;

import java.math.BigDecimal;
import java.util.Objects;

public class MeasurementValueEntity {

    private final String unit;

    private final BigDecimal value;

    private MeasurementValueEntity(String unit, BigDecimal value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public BigDecimal getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MeasurementValueEntity that = (MeasurementValueEntity) o;
        return Objects.equals(unit, that.unit) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    @Override
    public String toString() {
        return unit + " " + value;
    }


}
