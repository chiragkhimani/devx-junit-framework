package com.junit.class04;


import com.junit.class02.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for calculator

// Test Cases

//        1) a = 10, b = 10   exp - 0
//        2) a = 10, b = 20   exp - -10
//        3) a = 20, b = 10   exp - 10
//        4) a = 10, b = 0    exp - 10


public class CalculatorSubMethodTest {

    // Declaration of object
    Calculator c ;

    // Pre-condition
    @Before
    public void setUp(){
        // Initialization of object
        c = new Calculator();
    }

    // When we use @Test then it'll become test cases otherwise it'll be only java method
    @Test
    public void verifyPositiveEqualNumber(){
        double actResult = c.sub(10, 10);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveFirstLargerThanSecondNumber(){
        double actResult = c.sub(20, 10);
        double expResult = 10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.sub(10, 20);
        double expResult = -10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
        double actResult = c.sub(0, 10);
        double expResult = -10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }



}
