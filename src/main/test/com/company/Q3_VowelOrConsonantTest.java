package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_VowelOrConsonantTest {

    Q3_VowelOrConsonant testObj;

    @Before
    public void setUp(){
        testObj = new Q3_VowelOrConsonant();
    }

    @After
    public  void tareDown(){
        testObj = null;
    }


    @Test
    public  void testStringToVowelAndConsonantConversion(){
        String expectedValue = "Vowel Consonant Vowel Consonant ";
        String actualValue = testObj.convertStringToVowelAndConsonant("uday");
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public  void testInvalidInputConversion(){
        String expectedValue = "Error Not a proper word";
        String actualValue = testObj.convertStringToVowelAndConsonant("123");
        assertEquals(expectedValue, actualValue);

    }



}