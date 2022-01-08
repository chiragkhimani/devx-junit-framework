package com.junit.class03;


import com.junit.class02.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for calculator

// Test Cases

//        1) a = 10, b = 10   exp - 100
//        2) a = 10, b = 0   exp - 0
//        3) a = -20, b = 0   exp - 0
//        4) a = -10, b = -10    exp - (100)


public class CalculatorMulMethodTest {

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
        double actResult = c.mul(10, 10);
        double expResult = 100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveFirstLargerThanSecondNumber(){
        double actResult = c.mul(20, 0);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.mul(-20, 0);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
        double actResult = c.mul(-10, -10);
        double expResult = 100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

}
