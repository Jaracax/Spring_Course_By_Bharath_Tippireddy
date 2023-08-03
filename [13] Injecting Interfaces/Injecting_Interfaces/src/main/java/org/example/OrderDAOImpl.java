package org.example;

import org.springframework.stereotype.Component;

// This class implements the "OrderDAO" interface, containing the actual code to access and manipulate order data.
// Purpose in Dependency Injection: It serves as one of the possible implementations for the "OrderDAO" interface
// that Spring can inject into other classes requiring data access functionality.
@Component("dao")
public class OrderDAOImpl implements OrderDAO{


    @Override
    public void createOrder() {
        System.out.println("Inside order DAO create order");
    }
}
