package org.example.stream.advanced;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
class AddMarksInStudent {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student(1, "Ujwala", 87),
                new Student(2, "Akshay", 98),
                new Student(3, "Pruthvi", 80));

        List<Student> addedExtraMarks = studentList.stream()
                .map(st -> new Student(st.getId(), st.getName(), st.getMarks() + 5))
                .collect(Collectors.toList());

        addedExtraMarks.forEach(System.out::println);

        List<Integer> addedMarks = studentList.stream().map(st -> st.getMarks() + 5).collect(Collectors.toList());
        System.out.println(addedMarks);
    }
}
