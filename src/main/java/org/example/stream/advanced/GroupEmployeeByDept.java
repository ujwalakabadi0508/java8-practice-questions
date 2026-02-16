package org.example.stream.advanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByDept {

    public static void main(String[] args) {

        //11. Group employees by department
        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "IT"),
                new Employee(2, "Ops"),
                new Employee(3, "IT"),
                new Employee(4, "Ops"),
                new Employee(5, "IT"),
                new Employee(6, "Support"));
        Map<String, List<Employee>> employeeList = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeList);
    }
}

class Employee{
    private int id;
    private String department;

    public Employee(int id, String department) {
        this.id = id;
        this.department = department;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
