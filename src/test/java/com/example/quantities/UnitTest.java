package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.Unit.KILOGRAM;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void shouldConvertValueToBaseUnit() {
        assertEquals(5500, KILOGRAM.toBaseUnit(5.5), .01);
    }

    @Test
    public void fromBaseUnit() {
        assertEquals(5.5, KILOGRAM.fromBaseUnit(5500), .01);
    }
}