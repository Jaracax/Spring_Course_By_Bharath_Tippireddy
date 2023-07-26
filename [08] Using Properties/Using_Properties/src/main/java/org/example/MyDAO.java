package org.example;

// Simple POJO class which we will be using to create a bean and inject properties values
public class MyDAO {

    private String dbServer;

    public MyDAO(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "MyDAO{" +
                "dbServer='" + dbServer + '\'' +
                '}';
    }
}
