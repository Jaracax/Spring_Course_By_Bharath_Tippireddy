package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Test class to demonstrate usage of Spring beans and their properties
public class Test {

    public static void main(String[] args) {

    }

    // Test method for retrieving and printing Employee objects with primitive types properties
    public static void testOfPrimitiveTypes(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        // Retrieve and print Employee objects with primitive properties from the Spring context
        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println("Employee Id: " + employee1.getId());
        System.out.println("Employee Name: " + employee1.getName());

        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println("Employee Id: " + employee2.getId());
        System.out.println("Employee Name: " + employee2.getName());

        Employee employee3 = context.getBean("employee3", Employee.class);
        System.out.println("Employee Id: " + employee3.getId());
        System.out.println("Employee Name: " + employee3.getName());
    }

    // Test method for retrieving and printing Hospital object with list property
    public static void testOfList(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        Hospital hospital = context.getBean("hospital", Hospital.class);

        // Retrieve and print Hospital object with list property
        System.out.println("Hospital Name: " + hospital.getName());
        System.out.println("Hospital Departments: " + hospital.getDepartments());
        System.out.println("Hospital Departments: " + hospital.getDepartments().getClass());

    }

    // Test method for retrieving and printing Car object with set property
    public static void testOfSet(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

        // Retrieve and print Car object with set property
        Car car = context.getBean("car", Car.class);
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Departments: " + car.getModels());

    }

    // Test method for retrieving and printing Customer object with map property
    public static void testOfMap(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

        // Retrieve and print Customer object with map property
        Customer customer = context.getBean("customer", Customer.class);
        System.out.println("Customer Id: " + customer.getId());
        System.out.println("Customer Products: " + customer.getProducts());

    }

    // Test method for retrieving and printing CountriesAndLanguages object with properties (key-value pairs)
    public static void testOfProperties(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");
        CountriesAndLanguages countriesAndLanguages = context.getBean("countriesAndLangs", CountriesAndLanguages.class);

        // Retrieve and print CountriesAndLanguages object with properties (key-value pairs)
        System.out.println(countriesAndLanguages);
    }

    // Test method for retrieving and printing Students object with references to Scores object
    public static void testOfReferencesTypes(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

        // Retrieve and print Students object with reference to Scores object
        Students students = context.getBean("student3", Students.class);
        System.out.println(students);
    }
}
