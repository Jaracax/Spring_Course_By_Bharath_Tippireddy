package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Class with multiple methods to show that construction
injection works with the three injection methods shown in the XML file
*/
public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {
        ambiguityProblem();
    }

    public static void constructorInjectionWithValuesAsElement(){
        Employee employee = context.getBean("employee1", Employee.class);
        System.out.println(employee);
    }

    public static void constructorInjectionWithValuesAsAttribute(){
        Employee employee = context.getBean("employee2", Employee.class);
        System.out.println(employee);
    }

    public static void constructorInjectionWithCSchema(){
        Employee employee = context.getBean("employee3", Employee.class);
        System.out.println(employee);
    }

    public static void ambiguityProblem(){
        Addition addition = context.getBean("addition1", Addition.class);
        System.out.println(addition);
    }
}
