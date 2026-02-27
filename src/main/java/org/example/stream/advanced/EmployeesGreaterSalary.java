package org.example.stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{

    private int id;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee1(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeesGreaterSalary {
    public static void main(String[] args) {

        List<Employee1> employees = Arrays.asList(new Employee1(1, 6001),
                new Employee1(2, 5000),
                new Employee1(3, 6040));
        List<Employee1> employeesList = employees.stream()
                .filter(e -> e.getSalary() > 6000)
                .collect(Collectors.toList());

        employeesList.forEach(System.out::println);

    }
}
