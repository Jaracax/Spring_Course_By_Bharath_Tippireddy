package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
// POJO class in which it is shown the different ways of using Spring Expression Language

@Component
public class Instructor {

    /*
    "#{66+44}" = An expression that its result will be assigned to the id field
    To invoke a static method we use the syntax T(class).method(param) like this "#{T(java.lang.Math).abs(-99)}"
    Accessing objects "#{new Integer(88)}"
    String Types "#{'A literal string value'}"
    * */
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id;
    @Value("Name")
    private String name;

    @Value("#{topics}")
    private List<String> topics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                '}';
    }
}
