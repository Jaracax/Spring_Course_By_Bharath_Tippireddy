package org.example;

import java.util.List;

// Interface to define the methods for interacting with data
public interface EmployeeDAO {
    // Method signatures for create, update, delete, read operations on employees
    int create(Employee employee);

    int update(Employee employee);

    int delete(int id);

    Employee read(int id);

    List<Employee> read();
}
