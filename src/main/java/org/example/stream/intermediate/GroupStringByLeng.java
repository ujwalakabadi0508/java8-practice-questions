package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringByLeng {
    public static void main(String[] args) {

        //Group strings by their length
        List<String> stringList = Arrays.asList("one","to", "three", "four", "five","Six");
        Map<Integer, Long> grpByString = stringList.stream().map(String::length)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(grpByString);

    }
}
