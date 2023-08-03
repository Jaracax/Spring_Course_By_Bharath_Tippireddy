package org.example;

// This interface defines the contract for the "Order Data Access Object" (DAO) responsible for managing order data.
// Purpose in Dependency Injection: It showcases how Spring can handle
// different DAO implementations without the need to modify dependent classes.
public interface OrderDAO {
    void createOrder();
}
