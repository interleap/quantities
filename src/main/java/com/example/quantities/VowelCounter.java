package com.example.quantities;

public class VowelCounter {
    public int count(String string) {
        return string.replaceAll("[^aeiou]+","").length();
    }
}
