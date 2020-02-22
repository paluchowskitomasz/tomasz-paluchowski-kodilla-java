package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private final Set<Continent> continentsOfWorld = new HashSet<>();

    public void addContinent(Continent continent){
        continentsOfWorld.add(continent);
    }


    public void removeContinent(Continent continent){
        continentsOfWorld.remove(continent);
    }


    public Set<String> getCountiriesFromAllContinents() {

        return continentsOfWorld.stream()
                .flatMap(continent -> continent.getCountriesContinent().stream())
                .filter(country -> country!= null)
                .map(Country::getCountryName)
                .collect(Collectors.toSet());


    }

    public BigDecimal getPeopleQuantity() {

        return continentsOfWorld.stream()
                .flatMap(continent -> continent.getCountriesContinent().stream())
                .filter(country -> country !=null)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }


}


