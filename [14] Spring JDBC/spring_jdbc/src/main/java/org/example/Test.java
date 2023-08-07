package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

// Test class showing different of how data is being use
public class Test {

    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfiguration.xml");

    public static void main(String[] args) {
    }

    public static void jdbcTemplateInsertRealTime(){
        EmployeeDAO dao = context.getBean("employeeDAO", EmployeeDAO.class);
        Employee employee = new Employee();
        employee.setId(3);
        employee.setFirstName("Daniel");
        employee.setLastName("Chirinos");
        int result = dao.create(employee);
        System.out.println("Number of records inserted are: " + result);
    }

    public static void jdbcTemplateInsertUsingOnlyXML(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sqlQuery = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sqlQuery,1,"Jose","Dominguez");
        System.out.println("Number of records inserted are: " + result);
    }

    public static void jdbcTemplateUpdate(){
        EmployeeDAO dao = context.getBean("employeeDAO", EmployeeDAO.class);
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Daniel");
        employee.setLastName("Chirinos");
        int result = dao.update(employee);
        System.out.println("Number of records updated are: " + result);
    }

    public static void jdbcTemplateDelete(){
        EmployeeDAO dao = context.getBean("employeeDAO", EmployeeDAO.class);
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Daniel");
        employee.setLastName("Chirinos");
        int result = dao.delete(3);
        System.out.println("Number of records deleted are: " + result);
    }

    public static void jdbcTemplateReadRowMapper(){
        EmployeeDAO dao = context.getBean("employeeDAO", EmployeeDAO.class);
        Employee employee = dao.read(1);
        System.out.println("Employee record: " + employee);
    }

    public static void jdbcTemplateReadRowMapperList(){
        EmployeeDAO dao = context.getBean("employeeDAO", EmployeeDAO.class);
        List<Employee> employee = dao.read();
        System.out.println("Employee record: " + employee);
    }
}
