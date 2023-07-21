package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        Prescription prescription = context.getBean("prescription", Prescription.class);
        System.out.println(prescription);


    }

}
