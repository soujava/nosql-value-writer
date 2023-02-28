package org.jnosql.demo.se;

import jakarta.nosql.ValueWriter;

public class MeasurementValueWriter implements ValueWriter<MeasurementValue, String> {
    @Override
    public String write(MeasurementValue value) {
        return value.toString();
    }

    @Override
    public boolean test(Class<?> type) {
        return MeasurementValue.class.equals(type);
    }
}
