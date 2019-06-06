package com.example.quantities;

public enum Unit {
    GRAM(1), KILOGRAM(1000);

     final int scale;
    Unit(int scale) {
        this.scale = scale;
    }

    double toBaseUnit(double value) {
        return value * scale;
    }

    public double fromBaseUnit(double valueInBaseUnit) {
        return valueInBaseUnit/scale;
    }
}
