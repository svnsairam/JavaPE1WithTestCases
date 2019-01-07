package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatingLastNLettersTest {


    RepeatingLastNLetters repeatingLastNLetters;

    @Before
    public void setUp(){
        repeatingLastNLetters = new RepeatingLastNLetters();
    }

    @After
    public  void tearDown(){
        repeatingLastNLetters = null;
    }
        @Test
        public  void repeatingNLetters(){
            String expectedValue = "Stackrouterouterouterouterouteroute";

            String actualValue = repeatingLastNLetters.repeatLastNLetters("Stackroute", 5);

            assertEquals(expectedValue, actualValue);
        }


}