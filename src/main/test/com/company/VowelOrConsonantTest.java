package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {

    VowelOrConsonant vowelOrConsonant;

    @Before
    public void setUp(){
        vowelOrConsonant = new VowelOrConsonant();
    }

    @After
    public  void tareDown(){
        vowelOrConsonant = null;
    }


    @Test
    public  void testStringToVowelAndConsonantConversion(){
        String expectedValue = "Vowel Consonant Vowel Consonant ";
        String actualValue = vowelOrConsonant.convertStringToVowelAndConsonant("uday");
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public  void testInvalidInputConversion(){
        String expectedValue = "Error Not a proper word";
        String actualValue = vowelOrConsonant.convertStringToVowelAndConsonant("123");
        assertEquals(expectedValue, actualValue);

    }



}