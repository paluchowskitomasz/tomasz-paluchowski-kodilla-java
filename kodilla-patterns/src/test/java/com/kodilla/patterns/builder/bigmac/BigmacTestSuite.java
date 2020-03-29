package com.kodilla.patterns.builder.bigmac;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BigmacTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        Bigmac burger = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .burgers(2)
                .sauce("1000 Islands")
                .ingredients("Onion")
                .ingredients("Cheese")
                .ingredients("Cucumber")
                .ingredients("Mushroom")
                .build();
        System.out.println(burger);
        //When
        String bun = burger.getBun();
        int burgers = burger.getBurgers();
        String sauce = burger.getSauce();
        int howManyIngredients = burger.getIngredients().size();
        //Then
        Assert.assertEquals("without sesame", bun);
        Assert.assertEquals(2, burgers);
        Assert.assertEquals("1000 Islands", sauce);
        Assert.assertEquals(4, howManyIngredients);

    }
}
