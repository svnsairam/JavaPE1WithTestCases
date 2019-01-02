package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6_CapitalSmallDigitSpecialLetterTest {

    Q6_CapitalSmallDigitSpecialLetter testObj;

    @Before
    public void setUp(){
        testObj = new Q6_CapitalSmallDigitSpecialLetter();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }

    @Test
    public void testTypeOfCharecter(){
        String expectedValue = "Capital Letter";
        String actualValue = testObj.checkCapitalSmallDigitSpecialLetter('A');

        assertEquals(expectedValue,actualValue);

         expectedValue = "Small Letter";
         actualValue = testObj.checkCapitalSmallDigitSpecialLetter('s');

        assertEquals(expectedValue,actualValue);

         expectedValue = "Number";
         actualValue = testObj.checkCapitalSmallDigitSpecialLetter('2');

        assertEquals(expectedValue,actualValue);

         expectedValue = "Special Charecter";
         actualValue = testObj.checkCapitalSmallDigitSpecialLetter('$');

        assertEquals(expectedValue,actualValue);

    }

}