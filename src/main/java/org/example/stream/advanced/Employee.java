package org.example.stream.advanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class GroupEmployeeByDept {

    public static void main(String[] args) {

        //11. Group employees by department
        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "IT", 5000),
                new Employee(2, "Ops", 5000),
                new Employee(3, "IT", 5000),
                new Employee(4, "Ops", 5000),
                new Employee(5, "IT", 5000),
                new Employee(6, "Support", 5000));
        Map<String, List<Employee>> employeeList = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeList);
    }
}

public class Employee{
    private int id;
    private String department;
    private long salary;


    public Employee(int id, String department, long salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
