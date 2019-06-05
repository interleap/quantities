package com.example.quantities;

import java.util.Objects;

public class Kilogram {
    private final int value;

    public Kilogram(int value) {
        this.value = value;
    }

    public Kilogram add(Kilogram another) {
        return new Kilogram(value + another.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kilogram kilogram = (Kilogram) o;
        return value == kilogram.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
