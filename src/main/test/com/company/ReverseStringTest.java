package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setUp(){
        reverseString = new ReverseString();
    }

    @After
    public  void tearDown(){
        reverseString = null;
    }

    @Test
    public  void testStringReverse(){
        String expectedValue = "nodnol";
        String actualValue = reverseString.reverse("london");

        assertEquals(expectedValue,actualValue);
    }
}