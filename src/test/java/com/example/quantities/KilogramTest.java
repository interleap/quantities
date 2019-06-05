package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KilogramTest {
    @Test
    public void shouldAddTwoKilogramObjects(){
        Kilogram kilogram = new Kilogram(5);
        assertEquals(new Kilogram(8), kilogram.add(new Kilogram(3)));
    }

    @Test
    public void shouldAddTwoDifferentKilogramObjects(){
        Kilogram kilogram = new Kilogram(2);
        assertEquals(new Kilogram(3), kilogram.add(new Kilogram(1)));
    }
}
