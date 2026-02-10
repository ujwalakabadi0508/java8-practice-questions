package org.example.stream.intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        //Find frequency of each character in a string

        String str = "banana";
        Map<Character, Long> frequencyCount = str.chars().mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyCount);
    }
}
