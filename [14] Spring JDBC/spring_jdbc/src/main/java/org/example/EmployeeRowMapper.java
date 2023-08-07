package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

// EmployeeRowMapper is responsible for mapping rows from a ResultSet to Employee objects
public class EmployeeRowMapper implements RowMapper<Employee> {

    // The mapRow method is implemented to perform the actual mapping
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        // Set properties of the Employee object based on the current row in the ResultSet
        // resultSet.getInt(1) gets the value from the first column,
        // resultSet.getString(2) from the second, and so on
        employee.setId(resultSet.getInt(1));
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));
        return employee;
    }
}
