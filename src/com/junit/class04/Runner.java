package com.junit.class04;

// Test Case - Collection of test steps
// Test Suite - Collection of test cases

import com.junit.groups.ChiragCategory;
import com.junit.groups.MansurCategory;
import com.junit.groups.SmokeCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses(CalculatorDivMethodTest.class)
@Categories.ExcludeCategory(ChiragCategory.class)
public class Runner {

}
