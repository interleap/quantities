package com.example.quantities;

import static java.lang.Math.abs;

public class Weight {
    private final double value;
    private final Unit unit;

    public Weight(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Weight add(Weight another) {
        return new Weight(value + another.value, unit);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Weight weight = (Weight) other;
        return areValuesEqualToThousandthUnit(valueInBaseUnit(), weight.valueInBaseUnit());
    }

    private double valueInBaseUnit() {
        return unit.toBaseUnit(this.value);
    }

    private boolean areValuesEqualToThousandthUnit(double firstValue, double secondValue) {
        return abs(firstValue - secondValue) < .001;
    }

    @Override
    public int hashCode() {
        return (int)(valueInBaseUnit());
    }

    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
