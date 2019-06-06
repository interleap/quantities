package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.WeightUnit.GRAM;
import static com.example.quantities.WeightUnit.KILOGRAM;
import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void shouldAddTwoGramObjects(){
        assertEquals(new Quantity(10, GRAM), new Quantity(8, GRAM).add(new Quantity(2, GRAM)));
    }

    @Test
    public void shouldAddTwoKilogramObjects(){
        assertEquals(new Quantity(6, KILOGRAM), new Quantity(3, KILOGRAM).add(new Quantity(3, KILOGRAM)));
    }

    @Test
    public void shouldCheckIfWeightsOfDifferentTypesAreEqual(){
        assertEquals(new Quantity(5.5, KILOGRAM), new Quantity(5500, GRAM));
    }

    @Test
    public void shouldBeAbleToAddWeightsOfDifferentUnits(){
        assertEquals(new Quantity(4, KILOGRAM), new Quantity(3.3, KILOGRAM).add(new Quantity(700, GRAM)));
    }
}
