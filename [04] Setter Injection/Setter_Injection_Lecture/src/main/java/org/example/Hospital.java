package org.example;

import java.util.List;

/*
 * POJO class from which we will be creating a bean with a <List> value
 * */
public class Hospital {
    private String name;
    private List<String> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }
}
