package org.example;

// Class with three constructors of different parameters types to showcase the ambiguity problem
public class Addition {

    public Addition(double a, double b) {
        System.out.println("Inside constructor double");
    }
    public Addition(int a, int b) {
        System.out.println("Inside constructor int");
    }

    public Addition(String a, String b) {
        System.out.println("Inside constructor String");
    }
}
