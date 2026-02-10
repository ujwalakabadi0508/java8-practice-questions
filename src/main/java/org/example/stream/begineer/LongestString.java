package org.example.stream.begineer;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {

        //Find the longest string in a list
        List<String> lists = Arrays.asList("ujwala", "Akshay","Akshay","Varsha", "Bharati");
        Optional<String> longestLeng = lists.stream().max(Comparator.comparingInt(String::length));
        longestLeng.ifPresentOrElse(str -> System.out.println(longestLeng),
                ()-> System.out.println("Longest String not found"));
    }
}
