package org.jnosql.demo.se;

import jakarta.nosql.ValueReader;

public class MeasurementValueReader implements ValueReader {
    @Override
    public <T> T read(Class<T> type, Object value) {
        return (T) MeasurementValue.parser(value.toString());
    }

    @Override
    public boolean test(Class<?> type) {
        return MeasurementValue.class.equals(type);
    }
}
