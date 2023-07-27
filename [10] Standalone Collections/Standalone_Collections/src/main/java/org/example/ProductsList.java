package org.example;

import java.util.List;

// POJO clas from which we will be creating a bean with a Collection field
public class ProductsList {

    List<String> productsList;

    public List<String> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<String> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "ProductsList{" +
                "productsList=" + productsList +
                '}';
    }
}
