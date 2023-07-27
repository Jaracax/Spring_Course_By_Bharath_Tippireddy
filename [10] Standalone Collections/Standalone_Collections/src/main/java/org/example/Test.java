package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        ProductsList productsList = context.getBean("products",ProductsList.class);
        System.out.println(productsList);
    }
}
