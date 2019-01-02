package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_PrintTomOrJerryTest {


    Q2_PrintTomOrJerry tomJerryObject;
    @Before
    public void setUp(){
        tomJerryObject = new Q2_PrintTomOrJerry();
    }

    @Test
    public void checkTomAndJerry(){
        String expectedValue = "Tom";
        String actualValue = tomJerryObject.evaluate(22);

         assertEquals(expectedValue,actualValue);


         expectedValue = "Jerry";
         actualValue = tomJerryObject.evaluate(25);

         assertEquals(expectedValue,actualValue);
    }



    @After
    public void tearDown(){
        tomJerryObject = null;
    }


}