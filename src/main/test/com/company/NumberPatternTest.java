package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPatternTest {

    NumberPattern numberPattern;

    @Before
    public void setUp(){
        numberPattern = new NumberPattern();
    }

    @After
    public  void tearDown(){
        numberPattern = null;
    }

    @Test
    public void testNumberPattern(){
        String  expectedValue = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        String  actualValue = numberPattern.printSeries(5);

        assertEquals(expectedValue,actualValue);
    }

}