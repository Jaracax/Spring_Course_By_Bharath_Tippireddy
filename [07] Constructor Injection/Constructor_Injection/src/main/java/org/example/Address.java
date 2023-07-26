package org.example;

/*
 * POJO class from which we will be creating a bean to act as a reference type to other bean
 * */
public class Address {

    private String street;
    private String city;
    private String housePrivateNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHousePrivateNumber() {
        return housePrivateNumber;
    }

    public void setHousePrivateNumber(String housePrivateNumber) {
        this.housePrivateNumber = housePrivateNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", housePrivateNumber='" + housePrivateNumber + '\'' +
                '}';
    }
}
