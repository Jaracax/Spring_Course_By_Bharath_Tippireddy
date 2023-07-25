package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
    public static void main(String[] args) {

    }

    public static void dependencyCheck(){
        Prescription prescription = context.getBean("prescription", Prescription.class);
        System.out.println(prescription);
    }

    public static void innerBeans(){
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println(employee.hashCode());
    }
}