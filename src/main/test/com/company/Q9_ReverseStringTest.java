package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q9_ReverseStringTest {

    Q9_ReverseString testObj;

    @Before
    public void setUp(){
        testObj = new Q9_ReverseString();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }

    @Test
    public  void testStringReverse(){
        String expectedValue = "nodnol";
        String actualValue = testObj.reverse("london");

        assertEquals(expectedValue,actualValue);
    }
}