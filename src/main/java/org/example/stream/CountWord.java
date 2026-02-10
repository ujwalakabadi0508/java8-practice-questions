package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWord {
    public static void main(String[] args) {
        //Count how many strings start with a specific character

        List<String> lists = Arrays.asList("ujwala","Akshay","Varsha",
                "Bharati", "Shaila", "Sakshi", "Sameer", "Saanvi");
        Long countStr = lists.stream().filter(str -> str.startsWith("S")).count();
        System.out.println(countStr);

        char findCh = 'S';

        long countWord = lists.stream().filter(ch -> !ch.isEmpty() && ch.charAt(0) == findCh)
                .collect(Collectors.counting());
        System.out.println(countWord);


    }
}
