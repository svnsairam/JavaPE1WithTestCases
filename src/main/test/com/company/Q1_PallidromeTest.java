package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_PallidromeTest {

    Q1_Pallidrome testObj;

    @Before
    public void setUp(){
        testObj = new Q1_Pallidrome();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }

    @Test
    public void checkPallindromeSuccess(){
        boolean expectedValue = true;
        boolean actualValue = testObj.checkPallindrome(12321, 10000);

        assertEquals(expectedValue, actualValue);
    }


    @Test
    public  void checkPallindromeFailure(){
        boolean expectedValue = false;
        boolean actualValue = testObj.checkPallindrome(12345, 10000);

        assertEquals(expectedValue, actualValue);
    }
}