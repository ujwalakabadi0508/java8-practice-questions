package org.example.functionalinterface;

import org.example.stream.advanced.Employee;
import org.example.stream.advanced.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurationPrograms {

    public static void main(String[] args) {

        //find a duplicate chars with count using stream API
        String s = "Ujwala";
        Map<Character, Long> duplicatchars = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<Character, Long>> foundDuplicate = duplicatchars.entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList());

        System.out.println(foundDuplicate);

        //add 5 marks to all students marks using java 8
        List<Student> studentList = Arrays.asList(new Student(1, "Ujwala", 87),
                new Student(2, "Akshay", 98),
                new Student(3, "Pruthvi", 80));

        List<Integer> addingMarks = studentList.stream().map(stud -> stud.getMarks() + 5).collect(Collectors.toList());
        System.out.println(addingMarks);
        FurationPrograms.getGreaterSalary();

    }

    public static void getGreaterSalary(){
        List<Employee> listOfEmployee = Arrays.asList(new Employee(1, "Bharati", "IT", 5000, true, "Female"),
                new Employee(2,"Rahi", "Ops", 9000,false, "Female"),
                new Employee(3,"Nikita", "IT", 5000,true, "Female"),
                new Employee(4,"Ujwala", "Ops", 5000,false, "Male"),
                new Employee(5,"Pruthvi","IT", 8000,false, "Male"),
                new Employee(6,"Saanvi","Support", 9000,false, "Male"));

        List<Employee> greaterSalary = listOfEmployee.stream()
                .filter(emp -> emp.getSalary() > 6000)
                .collect(Collectors.toList());

        System.out.println(greaterSalary);

        //find and remove the duplciate from string
        String s = " Hello Hello Hello I amd doing good good ";
        String duplicate = Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
        System.out.println(duplicate);

        int [] arr = {1,3,4,5,4,3,4,5,1};
        long count = Arrays.stream(arr).filter(a -> a== 1).count();
        System.out.println(count);



    }
}
