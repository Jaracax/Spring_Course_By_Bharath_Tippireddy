package org.example;

import java.util.Properties;

public class CountriesAndLanguages {

    /*
     * POJO class from which we will be creating a bean with a <Properties> value
     * */
    private Properties countriesAndLanguages;

    public Properties getCountriesAndLanguages() {
        return countriesAndLanguages;
    }

    public void setCountriesAndLanguages(Properties countriesAndLanguages) {
        this.countriesAndLanguages = countriesAndLanguages;
    }

    @Override
    public String toString() {
        return "CountriesAndLanguages{" +
                "countriesAndLanguages=" + countriesAndLanguages +
                '}';
    }
}
