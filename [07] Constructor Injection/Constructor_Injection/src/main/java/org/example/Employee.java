package org.example;

/*
 * POJO class from which we will be creating a bean that will be using another bean
 * from the "Address" class as a reference type.
 * */
public class Employee {

    private int id;
    private Address address;

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }
}
