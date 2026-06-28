package com.adamshaffer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UtopianTreeTest {
    
    @Test
    void testUtopianTreeOne() {
        assertEquals(1, UtopianTree.calculate(0));
        
    }

    @Test
    void testUtopianTreeTwo() {
        assertEquals(2, UtopianTree.calculate(1));
        
    }

    @Test
    void testUtopianTreeThree() {
        assertEquals(3, UtopianTree.calculate(2));
        
    }


    @Test
    void testUtopianTreeFour() {
        assertEquals(6, UtopianTree.calculate(3));
        
    }

    @Test
    void testUtopianTreeFive() {
        assertEquals(7, UtopianTree.calculate(4));
        
    }


    @Test
    void testUtopianTreeSix() {
        assertEquals(14, UtopianTree.calculate(5));
        
    }
}
