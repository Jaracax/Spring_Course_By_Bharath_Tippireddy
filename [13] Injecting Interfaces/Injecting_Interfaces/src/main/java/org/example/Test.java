package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {
       OrderBOImpl bo = context.getBean("bo",OrderBOImpl.class);
       bo.placerOrder();
    }
}
