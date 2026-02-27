package org.example.stream.advanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOccurencesOfWordInString {
    public static void main(String[] args) {
        String s = "Hello how are you i am doing good but all are good or not i was asking for someone to ask me something " +
                "ohh i am doing good, i am also good , good good ";
        Map<String, Long> maxOccurence = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<String, Long>> maxValue = maxOccurence.entrySet().stream().max(Map.Entry.comparingByValue());

        maxValue.ifPresent(max -> System.out.println(max.getValue() + " "+ max.getKey()) );
    }

}
