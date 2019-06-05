package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GramTest {
    @Test
    public void shouldAddTwoGramObjects(){
        assertEquals(new Gram(10), new Gram(8).add(new Gram(2)));
    }

    @Test
    public void shouldAddTwoOtherGramObjects(){
        assertEquals(new Gram(6), new Gram(3).add(new Gram(3)));
    }
}
