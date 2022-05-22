package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1AndrewTest {
    R1Andrew testAll = new R1Andrew();
    @Test
    public void testAdd(){
        assertEquals(5, testAll.addNumber(2,3));
    }
    @Test
    public void testAllBase(){

        testAll.R1inputAllBase();
    }
    @Test
    public void testisMultiple(){
        assertEquals(false, testAll.R3isMultiple(0,4));

    }
    @Test
    public void testR4isEven(){
        assertTrue(testAll.R4isEven(4));
        assertFalse(testAll.R4isEven(15));
    }

    @Test
    public void testR5sumAll(){
        assertEquals(10, testAll.R5sumOfAll(4));
        assertEquals(0, testAll.R5sumOfAll(0));
    }

    @Test
    public void testR6sumOfAllOds(){
        assertEquals(4, testAll.R6sumOfAllOds(4));
        assertEquals(9, testAll.R6sumOfAllOds(6));
    }

    @Test
    public void testR7sumOfSquares(){
        assertEquals(0, testAll.R7sumOfSquares(0));
        assertEquals(14, testAll.R7sumOfSquares(3));

    }

    @Test
    public void testCountString(){
        assertEquals(2, testAll.R8countVowels("Andrew"));
    }

    @Test
    public void testremovePunctuation(){
        StringBuilder s = new StringBuilder ("This is , Hello, world");
        assertEquals(true, "This is  Hello world".equals(testAll.R9removePunk(s).toString()));
    }

    @Test
    public void testFlower(){
        Flower t = new Flower("Rose", 11, 275);
        assertEquals("Rose", t.getFlowername());
        assertEquals(11, t.getNumOfPetalss());
        assertEquals(275, t.getPrize());

        t.setFlowername("Hibiscus");
        assertEquals("Hibiscus", t.getFlowername());


    }

    @Test
    public void testupdateCardLimit(){
        CreditCard card = new CreditCard("Andrew","UBA","Savings",100,10000);
//        int value = card.updateCardLimit(1000);
//        assertTrue(value == 1100);
        assertEquals(500, card.updateCardLimit(400));
        assertEquals(9500, card.makePayment(500));
    }
}