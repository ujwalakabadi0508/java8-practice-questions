package org.example.stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfSalaryByDepartment {

    public static void main(String[] args) {

        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "Bharati", "IT", 5000, true, "Female"),
                new Employee(2,"Rahi", "Ops", 9000,false, "Female"),
                new Employee(3,"Nikita", "IT", 5000,true, "Female"),
                new Employee(4,"Ujwala", "Ops", 5000,false, "Male"),
                new Employee(5,"Pruthvi","IT", 8000,false, "Male"),
                new Employee(6,"Saanvi","Support", 9000,false, "Male"));

        Map<String, Long> sunOfSalary = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(sunOfSalary);
    }
}
