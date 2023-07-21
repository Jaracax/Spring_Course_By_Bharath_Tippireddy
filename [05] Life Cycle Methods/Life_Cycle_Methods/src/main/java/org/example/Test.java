package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// For the sake of the program not giving multiple undesired results, several parts of the project are being commented
public class Test {

    public static void main(String[] args) {
        lifeCyclesXMLConfig();
    }

    public static void lifeCyclesXMLConfig(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        Patient patient = context.getBean("patient1", Patient.class);
        System.out.println(patient);
        context.registerShutdownHook();
    }

    // Method from which we would be calling a bean using the Spring interfaces configuration for the init and destroy methods
//    public static void lifeCyclesInterfaces(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
//        Patient patient = context.getBean("patient2", Patient.class);
//        System.out.println(patient);
//        context.registerShutdownHook();
//    }
}
