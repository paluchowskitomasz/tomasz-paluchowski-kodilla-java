package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);

        //When
        double add = calc.add(1,1);
        double sub = calc.sub(10,5);
        double mul = calc.mul(5,5);
        double div = calc.div(100,2);

        //Then
        Assert.assertEquals(2, add,0);
        Assert.assertEquals(5, sub,0);
        Assert.assertEquals(25, mul,0);
        Assert.assertEquals(50, div,0);
    }

}