package com.example.quantities;

public class Unit {
    public static final Unit GRAM = new Unit(1);
    public static final Unit KILOGRAM = new Unit(1000);

    private final int scale;
    private Unit(int scale) {
        this.scale = scale;
    }

    double toBaseUnit(double value) {
        return value * scale;
    }

    public double fromBaseUnit(double valueInBaseUnit) {
        return valueInBaseUnit/scale;
    }
}
