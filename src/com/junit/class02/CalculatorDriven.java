package com.junit.class02;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

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

@RunWith(Parameterized.class)
public class CalculatorDriven {

    String str;

    @Parameterized.Parameters(name = "{0}")
    public static Collection data() {
        return Arrays.asList("Test", "Demo", "Testing");
    }

    public CalculatorDriven(String str){
        this.str = str;
    }

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


}
