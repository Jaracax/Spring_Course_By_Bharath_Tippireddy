package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// This class implements the "OrderBO" interface, providing the actual code for the BO's functions.
// Purpose in Dependency Injection: It demonstrates how Spring can inject
// interfaces into classes that rely on them, regardless of the specific implementation.
@Component("bo")
public class OrderBOImpl implements OrderBO{

    @Autowired
    @Qualifier("dao2")
    private OrderDAO orderDAO;

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public void placerOrder() {
        System.out.println("Inside order BO");
        orderDAO.createOrder();
    }
}
