package com.stackroute.javaPe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumberInDecreasingOrderTest {
    SortNumberInDecreasingOrder sortNumberInDecreaseingOrder;

    @Before
    public void setUp() {
        sortNumberInDecreaseingOrder = new SortNumberInDecreasingOrder();
    }

    @After
    public void tearDown() {
        sortNumberInDecreaseingOrder = null;
    }

    @Test
    public void testDecreasingOrderOfNumber() {
        String expectedValue = "544332";
        String actualValue = sortNumberInDecreaseingOrder.sortNumberInDecreaseingOrder(234534);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAdditionOfEvenNumbersGreaterThan15() {
        boolean expectedValue = false;
        boolean actualValue = sortNumberInDecreaseingOrder.addTheEvenDigits(234534);
        assertEquals(expectedValue, actualValue);
        expectedValue = true;
        actualValue = sortNumberInDecreaseingOrder.addTheEvenDigits(445566);
        assertEquals(expectedValue, actualValue);
    }
}