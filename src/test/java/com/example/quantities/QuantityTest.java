package com.example.quantities;

import org.junit.Test;

import static com.example.quantities.LengthUnit.CENTIMETRE;
import static com.example.quantities.LengthUnit.METRE;
import static com.example.quantities.WeightUnit.GRAM;
import static com.example.quantities.WeightUnit.KILOGRAM;
import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void shouldAddTwoLengthQuantitiesOfSameType(){
        assertEquals(new Quantity(10, CENTIMETRE), new Quantity(8, CENTIMETRE).add(new Quantity(2, CENTIMETRE)));
    }

    @Test
    public void shouldAddTwoWeightQuantitiesOfSameType(){
        assertEquals(new Quantity(6, KILOGRAM), new Quantity(3, KILOGRAM).add(new Quantity(3, KILOGRAM)));
    }

    @Test
    public void shouldCheckIfQuantitiesOfDifferentTypesAreEqual(){
        assertEquals(new Quantity(5.5, KILOGRAM), new Quantity(5500, GRAM));
    }

    @Test
    public void shouldBeAbleToAddQuantitiesOfDifferentUnits(){
        assertEquals(new Quantity(4, METRE ), new Quantity(3.3, METRE).add(new Quantity(70, CENTIMETRE)));
    }
}
