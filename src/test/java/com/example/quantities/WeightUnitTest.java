package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.WeightUnit.GRAM;
import static com.example.quantities.WeightUnit.KILOGRAM;
import static org.junit.Assert.*;

public class WeightUnitTest {

    @Test
    public void gramShouldBeTheBaseUnit() {
        assertEquals(10, GRAM.toBaseUnit(10), .01);
    }

    @Test
    public void kilogramShouldBeThousandTimesBaseUnit() {
        assertEquals(5000, KILOGRAM.toBaseUnit(5), .01);
    }
}