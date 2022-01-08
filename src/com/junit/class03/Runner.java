package com.junit.class03;

// Test Case - Collection of test steps
// Test Suite - Collection of test cases

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorDivMethodTest.class, CalculatorMulMethodTest.class})
public class Runner {

}
