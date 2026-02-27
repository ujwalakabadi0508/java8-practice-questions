package org.example.stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateElement {

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1,2,3,4,3,2,1,2,3,4,4,5,6);
        Map<Integer, Long> counting = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> duplciates = counting.entrySet().stream().filter(c -> c.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplciates);
        System.out.println(counting);
    }
}
