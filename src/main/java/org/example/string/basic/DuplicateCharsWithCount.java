package org.example.string.basic;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharsWithCount {
    public static void main(String[] args) {

        String s = "banana";
        Map<Character, Long> mapChar = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapChar);
//        mapChar.entrySet().stream().filter(e -> e.getValue()> 1).collect(Collectors.toList());
        Optional<Map.Entry<Character, Long>> minValue = mapChar.entrySet().stream().min(Map.Entry.comparingByValue());
        System.out.println(minValue);

    }
}
