package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7_SortNumberInDecreasingOrderTest {

    Q7_SortNumberInDecreasingOrder testObj;

    @Before
    public void setUp(){
        testObj = new Q7_SortNumberInDecreasingOrder();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }

    @Test
    public void testDecreasingOrderOfNumber(){
        String expectedValue = "544332";
        String actualValue = testObj.sortNumberInDecreaseingOrder(234534);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testAdditionOfEvenNumbersGreaterThan15(){
        boolean expectedValue = false;
        boolean actualValue = testObj.addTheEvenDigits(234534);

        assertEquals(expectedValue,actualValue);

        expectedValue = true;
        actualValue = testObj.addTheEvenDigits(445566);
        assertEquals(expectedValue,actualValue);

    }


}