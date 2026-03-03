package org.example.stream.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GroupEmployeeByDept {

    public static void main(String[] args) {

        //Group employees by department
        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "Bharati", "IT", 5000, true, "Female"),
                new Employee(2,"Rahi", "Ops", 9000,false, "Female"),
                new Employee(3,"Nikita", "IT", 5000,true, "Female"),
                new Employee(4,"Ujwala", "Ops", 5000,false, "Male"),
                new Employee(5,"Laxman","IT", 8000,false, "Male"),
                new Employee(5,"Pruthvi","Support", 18000, true, "Female"),
                new Employee(6,"Saanvi","Support", 9000,false, "Male"));

        //Group a list of employees by department.
        Map<String, List<Employee>> employeeList = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeList);

        //Count employees in each department.
        Map<String, Long> countEmpByDep = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("countEmp"+countEmpByDep);

        //Count the total Salary of all the employee
        double totalSalary = listOfEmployee.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);

        //Find the sum of salaries grouped by department
        Map<String, Long> sumOfSalaryByDep = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(sumOfSalaryByDep);


        //Count the employee by department
        Map<String, Long> groupByDepa = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(groupByDepa);

        //Find highest paid employee in each department.
        Map<String, Optional<Employee>> maxHighestSalary = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(maxHighestSalary);

        //Find average salary per department.
        Map<String, Double> averageSalary = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(  averageSalary);

        //Sort employees by salary and then by name.
        Stream<Employee> sortEmployee = listOfEmployee.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary)
                        .thenComparing(Employee::getName));
        System.out.println("Sort Employee by Salary and get Name"+sortEmployee);

        //Partition employees into active/inactive using partitioningBy.
        Map<Boolean, List<Employee>> isActiveEmp = listOfEmployee.stream()
                .collect(Collectors.partitioningBy(emp -> emp.isActive() == true));
        System.out.println(isActiveEmp);

        //find the deparment with maximum employee
        Optional<Map.Entry<String, Long>> maxEmployeeByDep = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("Employee "+maxEmployeeByDep);

        //Create a nested grouping (department → gender → count).
        Map<String, Map<String, Long>> nestedGrouping = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println("Nested grouping "+nestedGrouping);

        //Find the overall highest paid employee.
        Optional<Employee> maxSalary = listOfEmployee.stream().max(Comparator.comparingLong(Employee::getSalary));
        System.out.println("maxSalary "+maxSalary);

        //Find the youngest/oldest employee using streams.
        //summaryStatistics() is used when you want multiple aggregate values in one pass over the stream.
        LongSummaryStatistics minMax = listOfEmployee.stream().mapToLong(Employee::getSalary).summaryStatistics();
        System.out.println("Max :::: "+ minMax.getMax());
        System.out.println("MIN ::: "+minMax.getMin());
    }
}

public class Employee{
    private int id;
    private String name;
    private String department;
    private long salary;
    private boolean isActive;
    private String gender;

    public Employee(int id, String name, String department, long salary, boolean isActive, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isActive = isActive;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", isActive=" + isActive +
                ", gender='" + gender + '\'' +
                '}';
    }
}
