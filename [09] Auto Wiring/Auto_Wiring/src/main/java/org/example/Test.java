package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Test class from which we will be showing the different types of auto wiring
public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {
        autoWiringByAnnotationInSetter();
    }


    public static void autoWiringByType(){
        Employee employee = context.getBean("employee1", Employee.class);
        System.out.println(employee);
    }

    public static void autoWiringByName(){
        Employee employee = context.getBean("employee2", Employee.class);
        System.out.println(employee);
    }

    public static void autoWiringByConstructor(){
        Employee employee = context.getBean("employee3", Employee.class);
        System.out.println(employee);
    }

    public static void autoWiringByAnnotationInSetter(){
        Employee employee = context.getBean("employee4", Employee.class);
        System.out.println(employee);
    }
}
