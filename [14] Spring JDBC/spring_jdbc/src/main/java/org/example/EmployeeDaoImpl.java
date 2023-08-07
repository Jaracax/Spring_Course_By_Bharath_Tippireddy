package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

// Class that implements methods for data operations
@Component("employeeDAO")
public class EmployeeDaoImpl implements EmployeeDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Employee employee) {
        String sqlQuery = "insert into employee values(?,?,?)";
        return jdbcTemplate.update(sqlQuery,employee.getId(),employee.getFirstName(),employee.getLastName());
    }

    @Override
    public int update(Employee employee) {
        String sqlQuery = "update employee set firstName=?, lastName=? where id=?";
        return jdbcTemplate.update(sqlQuery, employee.getFirstName(), employee.getLastName(), employee.getId());
    }

    @Override
    public int delete(int id) {
        String sqlQuery = "delete from employee where id=?";
        return jdbcTemplate.update(sqlQuery,id);
    }

    @Override
    public Employee read(int id) {
        String sqlQuery = "select * from employee where id=?";
        EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
        return jdbcTemplate.queryForObject(sqlQuery, employeeRowMapper, id);
    }

    @Override
    public List<Employee> read() {
        String sqlQuery = "select * from employee";
        EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
        return jdbcTemplate.query(sqlQuery, employeeRowMapper);
    }
}
