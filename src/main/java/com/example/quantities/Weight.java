package com.example.quantities;

import java.util.Objects;

public class Weight {
    private final int value;
    private final Unit unit;

    public Weight(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Weight add(Weight another) {
        return new Weight(value + another.value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return value == weight.value &&
                unit == weight.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
