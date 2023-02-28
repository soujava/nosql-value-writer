package org.jnosql.demo.se;


import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

import java.util.Objects;

@Entity
public class Drink {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private MeasurementValue measurementValue;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MeasurementValue getMeasurementValue() {
        return measurementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Drink drink = (Drink) o;
        return Objects.equals(id, drink.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", measurementValue=" + measurementValue +
                '}';
    }
}
