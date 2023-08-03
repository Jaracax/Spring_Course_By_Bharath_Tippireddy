package org.example;

import org.springframework.stereotype.Component;

// This class also implements the "OrderDAO" interface but provides an alternative implementation for order data management.
// Purpose in Dependency Injection: It highlights Spring's capability to switch between
// different implementations of the same interface without changing the dependent classes.
@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO{


    @Override
    public void createOrder() {
        System.out.println("Inside orderDAO2 create order()");
    }
}
