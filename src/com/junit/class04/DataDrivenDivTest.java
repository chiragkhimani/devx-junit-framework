package com.junit.class04;

import com.junit.class02.Calculator;
import com.junit.groups.ChiragCategory;
import com.junit.groups.MansurCategory;
import com.junit.groups.SmokeCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DataDrivenDivTest {

    // Variable we will use inside test
    Integer num;

    // Constructor to initialize variable
    public DataDrivenDivTest(Integer num){
       this.num = num;
    }

    // This method will create test data
    @Parameterized.Parameters (name = "Running with {0}")
    public static Collection createData(){
        Integer data[] = {10,20,100,50};
        return Arrays.asList(data);
    }


    Calculator c ;

    // Pre-condition
    @Before
    public void setUp(){
        // Initialization of object
        c = new Calculator();
    }

    @Test
    @Category(ChiragCategory.class)
    public void verifyPositiveEqualNumber(){
        double actResult = c.div(num, num);
        double expResult = 1;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }


}
