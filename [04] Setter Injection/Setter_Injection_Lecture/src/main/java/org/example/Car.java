package org.example;

import java.util.Set;

/*
 * POJO class from which we will be creating a bean with a <set> value
 * */
public class Car {

    private String name;
    private Set<String> models;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getModels() {
        return models;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }
}
