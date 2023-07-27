package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        Instructor instructor = context.getBean("instructor",Instructor.class);
        System.out.println(instructor);
    }


}
