package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_RepeatingLastNLettersTest {


    Q10_RepeatingLastNLetters testObj;

    @Before
    public void setUp(){
        testObj = new Q10_RepeatingLastNLetters();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }
        @Test
        public  void repeatingNLetters(){
            String expectedValue = "Stackrouterouterouterouterouteroute";

            String actualValue = testObj.repeatLastNLetters("Stackroute", 5);

            assertEquals(expectedValue, actualValue);
        }


}