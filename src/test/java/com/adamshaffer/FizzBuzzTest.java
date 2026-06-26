package com.adamshaffer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testOne() {
        assertEquals("1\n", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void testFive() {
        assertEquals("1\n2\nFizz\n4\nBuzz\n", FizzBuzz.fizzBuzz(5));
    }
    @Test
    void testFizzBuzz() {
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", FizzBuzz.fizzBuzz(15));
    }
    
}
