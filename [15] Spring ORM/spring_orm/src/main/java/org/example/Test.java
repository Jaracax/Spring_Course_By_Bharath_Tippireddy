package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {
        insertingValues();
    }

    public static void insertingValues(){
        ProductDaoImpl productDao = context.getBean("something", ProductDaoImpl.class);
        Product product = new Product();
        product.setId(1);
        product.setName("Iphone");
        product.setDescription("something");
        product.setPrice(1000);
        productDao.create(product);
    }
}
