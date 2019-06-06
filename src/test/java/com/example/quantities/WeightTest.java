package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.WeightUnit.GRAM;
import static com.example.quantities.WeightUnit.KILOGRAM;
import static org.junit.Assert.assertEquals;

public class WeightTest {
    @Test
    public void shouldAddTwoGramObjects(){
        assertEquals(new Weight(10, GRAM), new Weight(8, GRAM).add(new Weight(2, GRAM)));
    }

    @Test
    public void shouldAddTwoKilogramObjects(){
        assertEquals(new Weight(6, KILOGRAM), new Weight(3, KILOGRAM).add(new Weight(3, KILOGRAM)));
    }

    @Test
    public void shouldCheckIfWeightsOfDifferentTypesAreEqual(){
        assertEquals(new Weight(5.5, KILOGRAM), new Weight(5500, GRAM));
    }

    @Test
    public void shouldBeAbleToAddWeightsOfDifferentUnits(){
        assertEquals(new Weight(4, KILOGRAM), new Weight(3.3, KILOGRAM).add(new Weight(700, GRAM)));
    }
}
