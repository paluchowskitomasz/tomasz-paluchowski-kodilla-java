package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {


    @Test
    public void testCheckPeopleQuantity() {

        //Given
        Country country1 = new Country("Poland","38000000");
        Country country2 = new Country("Italy","100000000");
        Country country3 = new Country("Thailand","101000000");
        Country country4 = new Country("India","8000000");
        Country country5 = new Country("Japan","3000000");
        Country country6 = new Country("Kongo","118000000");
        Country country7 = new Country("Gambia","433000000");
        Country country8 = new Country("Ethiopia","123000000");



        //When
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        Continent continent2 = new Continent("Asia");
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        Continent continent3 = new Continent("Africa");
        continent3.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);


        //Then

        Assert.assertEquals(2, continent1.getCountriesContinent().size());
        Assert.assertEquals(3, continent2.getCountriesContinent().size());
        Assert.assertEquals(3, continent3.getCountriesContinent().size());

        Assert.assertTrue(continent1.getCountries().contains("Italy"));
        Assert.assertTrue(continent1.getCountries().contains("Poland"));

        Assert.assertTrue(continent2.getCountries().contains("Thailand"));
        Assert.assertTrue(continent2.getCountries().contains("India"));
        Assert.assertTrue(continent2.getCountries().contains("Japan"));

        Assert.assertTrue(continent3.getCountries().contains("Kongo"));
        Assert.assertTrue(continent3.getCountries().contains("Gambia"));
        Assert.assertTrue(continent3.getCountries().contains("Ethiopia"));

        Assert.assertEquals("38000000",country1.getPeopleQuantity().toString());
        Assert.assertEquals("100000000",country2.getPeopleQuantity().toString());
        Assert.assertEquals("101000000",country3.getPeopleQuantity().toString());
        Assert.assertEquals("8000000",country4.getPeopleQuantity().toString());
        Assert.assertEquals("3000000",country5.getPeopleQuantity().toString());
        Assert.assertEquals("118000000",country6.getPeopleQuantity().toString());
        Assert.assertEquals("433000000",country7.getPeopleQuantity().toString());
        Assert.assertEquals("123000000",country8.getPeopleQuantity().toString());

     }


    @Test
    public void testCountriesOfWorld() {

        //Given
        Country country1 = new Country("Poland","38000000");
        Country country2 = new Country("Italy","100000000");
        Country country3 = new Country("Thailand","101000000");
        Country country4 = new Country("India","8000000");
        Country country5 = new Country("Japan","3000000");
        Country country6 = new Country("Kongo","118000000");
        Country country7 = new Country("Gambia","433000000");
        Country country8 = new Country("Ethiopia","123000000");



        //When
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        Continent continent2 = new Continent("Asia");
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        Continent continent3 = new Continent("Africa");
        continent3.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);

        World newWorld = new World();
        newWorld.addContinent(continent1);
        newWorld.addContinent(continent2);
        newWorld.addContinent(continent3);


        //Then

        Assert.assertEquals(8, newWorld.getCountiriesFromAllContinents().size());

        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Italy"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Poland"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Thailand"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("India"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Japan"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Kongo"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Gambia"));
        Assert.assertTrue(newWorld.getCountiriesFromAllContinents().contains("Ethiopia"));

    }

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country country1 = new Country("Poland","38000000");
        Country country2 = new Country("Italy","100000000");
        Country country3 = new Country("Thailand","101000000");
        Country country4 = new Country("India","8000000");
        Country country5 = new Country("Japan","3000000");
        Country country6 = new Country("Kongo","118000000");
        Country country7 = new Country("Gambia","433000000");
        Country country8 = new Country("Ethiopia","123000000");



        //When
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        Continent continent2 = new Continent("Asia");
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        Continent continent3 = new Continent("Africa");
        continent3.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);

        World newWorld = new World();
        newWorld.addContinent(continent1);
        newWorld.addContinent(continent2);
        newWorld.addContinent(continent3);


        //Then

        Assert.assertEquals("924000000", newWorld.getPeopleQuantity().toString());

    }
}
