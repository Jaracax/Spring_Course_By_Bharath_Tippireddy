package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * POJO class of which will be demonstrated the multiple ways of auto wiring
 * */
public class Employee {

    public Employee(Address address) {
        this.address = address;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
