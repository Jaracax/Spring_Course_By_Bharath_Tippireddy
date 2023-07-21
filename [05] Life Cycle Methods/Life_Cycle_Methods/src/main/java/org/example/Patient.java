package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// POJO class from which we will be creating and implementing the init and destroy methods
// InitializingBean and DisposableBean, are the Spring interfaces from which we would be calling an init and destroy method
public class Patient /* implements InitializingBean, DisposableBean*/ {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Init method being declared by the @PostConstruct annotation
    @PostConstruct
    public void hi(){
        System.out.println("Inside 'hi' method");
    }

    // Destroy method being declared by the @PostConstruct annotation
    @PreDestroy
    public void bye(){
        System.out.println("Inside 'bye' method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    // Methods init and destroy when using Spring Interfaces
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Inside 'afterPropertiesSet' method");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Inside 'destroy' method");
//    }
}
