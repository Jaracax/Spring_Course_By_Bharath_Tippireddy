package org.example;

// This interface defines the "Order Business Object" (BO) blueprint, describing what functions it should have.
// It shows how Spring can inject dependencies based on this blueprint,
// allowing different implementations of this interface to be used without changing the dependent classes.
public interface OrderBO {

    void placerOrder();
}
