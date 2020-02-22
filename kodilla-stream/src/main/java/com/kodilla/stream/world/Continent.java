package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {

    private String continentName;
    private final Set<Country> countriesContinent = new HashSet<>();

    public Continent(String newContinentName) {
        this.continentName = newContinentName;
    }


    public void addCountry(Country country){
        countriesContinent.add(country);
    }

    public void removeCountry(Country country){
        countriesContinent.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesContinent() {
        return countriesContinent;
    }

    public Set<String> getCountries() {
        return countriesContinent.stream()
                .map(country -> country.getCountryName())
                .collect(Collectors.toSet());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (continentName != null ? !continentName.equals(continent.continentName) : continent.continentName != null)
            return false;
        return countriesContinent != null ? countriesContinent.equals(continent.countriesContinent) : continent.countriesContinent == null;
    }

    @Override
    public int hashCode() {
        int result = continentName != null ? continentName.hashCode() : 0;
        result = 31 * result + (countriesContinent != null ? countriesContinent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countriesContinent +
                '}';
    }
}
