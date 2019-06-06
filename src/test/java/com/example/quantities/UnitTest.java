package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void shouldConvertToBaseUnit() {
        Unit unit = new Unit(5);
        assertEquals(10, unit.toBaseUnit(2), .01);
    }

    @Test
    public void shouldConvertFromBaseUnit() {
        Unit unit = new Unit(5);
        assertEquals(2, unit.fromBaseUnit(10), .01);
    }


}
