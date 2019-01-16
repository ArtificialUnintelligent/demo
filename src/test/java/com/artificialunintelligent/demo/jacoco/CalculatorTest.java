package com.artificialunintelligent.demo.jacoco;

import com.artificialunintelligent.demo.ArtificialUnintelligentApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 8:42 PM 2019/1/15
 */
public class CalculatorTest extends ArtificialUnintelligentApplicationTests{

    private Calculator calculator = new Calculator();

    @Test
    public void addTest(){
        int a = 10;
        int b = 20;
        int expected = 30;
        Assert.assertEquals(expected, calculator.add(a, b));
    }

    @Test
    public void subTest(){
        int a = 10;
        int b = 20;
        int expected = -10;
        Assert.assertEquals(expected, calculator.sub(a, b));
    }

}
