package org.example.stream.begineer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyFromList {
    public static void main(String[] args) {

        //Remove null or empty strings from a list
        List<String> lists = Arrays.asList("ujwala", "Akshay", "Varsha", "Bharati", null);

        List<String> removeNullStr = lists.stream().filter(str -> str != null).map(String::toUpperCase).collect(Collectors.toList());

        removeNullStr.forEach(System.out::println);
    }
}