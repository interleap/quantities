package com.example.quantities;

import java.util.Objects;

public class Gram {
    private final int value;

    public Gram(int value) {
        this.value = value;
    }

    public Gram add(Gram another) {
        return new Gram(value + another.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gram gram = (Gram) o;
        return value == gram.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
