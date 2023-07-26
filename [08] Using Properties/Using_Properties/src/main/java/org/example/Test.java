package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Simple class with main method to test if the injection of the properties is successful
public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {

        MyDAO myDAO = context.getBean("myDAO", MyDAO.class);
        System.out.println(myDAO);
    }


}
