package com.junit.class03;


import com.junit.class02.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for calculator

// Test Cases

//        1) a = 10, b = 10   exp - 1
//        2) a = 10, b = 20   exp - 0.5
//        3) a = 20, b = 10   exp - 2
//        4) a = 10, b = 10.5 exp -
//        5) a = -10, b = 20  exp - -0.5
//        6) a = 10, b = -10  exp - -1
//        7) a = 0, b = 10    exp - 0
//        8) a = 10, b = 0    exp - Cannot divide zero
//        9) a = 0, b  = abc  exp - Error
//        10) a = 0, b = -10  exp - 0
//        11) a = 0, b = 0    exp - Cannot divide zero
//        12) a= 2^16 -1 digit, b=2^16 -1 exp - Success
//        13) a= 2^16 digit, b=2^16 exp - Undefined

public class CalculatorDivMethodTest {

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
        double actResult = c.div(10, 10);
        double expResult = 1;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveFirstLargerThanSecondNumber(){
        double actResult = c.div(20, 10);
        double expResult = 2;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.div(10, 20);
        double expResult = 0.5;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
        double actResult = c.div(-10, 20);
        double expResult = -0.5;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }



}
