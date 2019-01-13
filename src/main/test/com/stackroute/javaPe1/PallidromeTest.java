package com.stackroute.javaPe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallidromeTest {
    Pallidrome pallidrome;

    @Before
    public void setUp() {
        pallidrome = new Pallidrome();
    }

    @After
    public void tearDown() {
        pallidrome = null;
    }

    @Test
    public void checkPallindromeSuccess() {
        boolean expectedValue = true;
        boolean actualValue = pallidrome.checkPallindrome(12321, 10000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void checkPallindromeFailure() {
        boolean expectedValue = false;
        boolean actualValue = pallidrome.checkPallindrome(12345, 10000);
        assertEquals(expectedValue, actualValue);
    }
}