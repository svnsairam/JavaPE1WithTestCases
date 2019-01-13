package com.stackroute.javaPe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalSmallDigitSpecialLetterTest {
    CapitalSmallDigitSpecialLetter capitalSmallDigitSpecialLetter;

    @Before
    public void setUp() {
        capitalSmallDigitSpecialLetter = new CapitalSmallDigitSpecialLetter();
    }

    @After
    public void tearDown() {
        capitalSmallDigitSpecialLetter = null;
    }

    @Test
    public void testTypeOfCharecter() {
        String expectedValue = "Capital Letter";
        String actualValue = capitalSmallDigitSpecialLetter.checkCapitalSmallDigitSpecialLetter('A');
        assertEquals(expectedValue, actualValue);
        expectedValue = "Small Letter";
        actualValue = capitalSmallDigitSpecialLetter.checkCapitalSmallDigitSpecialLetter('s');
        assertEquals(expectedValue, actualValue);
        expectedValue = "Number";
        actualValue = capitalSmallDigitSpecialLetter.checkCapitalSmallDigitSpecialLetter('2');
        assertEquals(expectedValue, actualValue);
        expectedValue = "Special Charecter";
        actualValue = capitalSmallDigitSpecialLetter.checkCapitalSmallDigitSpecialLetter('$');
        assertEquals(expectedValue, actualValue);

    }
}