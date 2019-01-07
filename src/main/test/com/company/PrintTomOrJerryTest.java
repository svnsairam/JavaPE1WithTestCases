package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintTomOrJerryTest {


    PrintTomOrJerry tomJerryObject;
    @Before
    public void setUp(){
        tomJerryObject = new PrintTomOrJerry();
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