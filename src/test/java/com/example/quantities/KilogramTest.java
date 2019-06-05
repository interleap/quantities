package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KilogramTest {
    @Test
    public void shouldaddTwoKilogramObjects(){
        Kilogram kilogram = new Kilogram(5);
        Kilogram another = new Kilogram(3);

        assertEquals(new Kilogram(8), kilogram.add(another));
    }
}
