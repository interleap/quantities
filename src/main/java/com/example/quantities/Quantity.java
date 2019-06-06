package com.example.quantities;

import static java.lang.Math.abs;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Quantity add(Quantity another) {
        double valueInBaseUnit = valueInBaseUnit() + another.valueInBaseUnit();
        double valueInCurrentUnit = unit.fromBaseUnit(valueInBaseUnit);
        return new Quantity( valueInCurrentUnit, unit);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Quantity quantity = (Quantity) other;
        return areValuesEqualToThousandthUnit(valueInBaseUnit(), quantity.valueInBaseUnit());
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
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
