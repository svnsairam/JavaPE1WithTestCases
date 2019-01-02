package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_NumberPatternTest {

    Q4_NumberPattern testObj;

    @Before
    public void setUp(){
        testObj = new Q4_NumberPattern();
    }

    @After
    public  void tearDown(){
        testObj = null;
    }

    @Test
    public void testNumberPattern(){
        String  expectedValue = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        String  actualValue = testObj.printSeries(5);

        assertEquals(expectedValue,actualValue);
    }

}