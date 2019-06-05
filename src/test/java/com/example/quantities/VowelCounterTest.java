package com.example.quantities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    @Test public void shouldCountCorrectlyInASingleVowelString(){
        assertEquals(1, new VowelCounter().count("e"));
    }


    @Test public void shouldCountCorrectlyInAMultipleVowelString(){
        assertEquals(7, new VowelCounter().count("iioueaa"));
    }
}
