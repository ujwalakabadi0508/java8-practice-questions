package org.example.string.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String s = "Hello Hello , I am doing good";
        String removeDuplicate = Arrays.stream(s.split("\\s+")).distinct().collect(Collectors.joining( " "));
        System.out.println(removeDuplicate);

        List<Integer> array = Arrays.asList(1,4,2,3,4,5,6,7,8,1,2,3,4);
        Map<Integer, Long> occrancnes = array.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occrancnes);

        int [] number = {1,2,4,3,2,1,3,4,5,3,2,};
        int sumNum = Arrays.stream(number).sum();
        System.out.println(sumNum);



    }
}
