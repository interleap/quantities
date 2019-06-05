package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightTest {
    @Test
    public void shouldAddTwoGramObjects(){
        assertEquals(new Weight(10, Unit.GRAM), new Weight(8, Unit.GRAM).add(new Weight(2, Unit.KILOGRAM)));
    }

    @Test
    public void shouldAddTwoKilogramObjects(){
        assertEquals(new Weight(6, Unit.KILOGRAM), new Weight(3, Unit.KILOGRAM).add(new Weight(3, Unit.KILOGRAM)));
    }
}
