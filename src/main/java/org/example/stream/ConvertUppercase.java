package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {
    public static void main(String[] args) {
        //Convert a list of strings to uppercase

        List<String> lists = Arrays.asList("ujwala","Akshay","Varsha", "Bharati");
        List<String> listOfUppercase = lists.stream().map(String::toUpperCase).collect(Collectors.toList());

        listOfUppercase.forEach(System.out::println);
    }
}
