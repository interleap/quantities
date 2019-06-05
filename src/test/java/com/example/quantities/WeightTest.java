package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.Unit.GRAM;
import static com.example.quantities.Unit.KILOGRAM;
import static org.junit.Assert.assertEquals;

public class WeightTest {
    @Test
    public void shouldAddTwoGramObjects(){
        assertEquals(new Weight(10, GRAM), new Weight(8, GRAM).add(new Weight(2, KILOGRAM)));
    }

    @Test
    public void shouldAddTwoKilogramObjects(){
        assertEquals(new Weight(6, KILOGRAM), new Weight(3, KILOGRAM).add(new Weight(3, KILOGRAM)));
    }

    @Test
    public void shouldCheckIfWeightsOfDifferentTypesAreEqual(){
        assertEquals(new Weight(5.5, KILOGRAM), new Weight(5500, GRAM));
    }
}
