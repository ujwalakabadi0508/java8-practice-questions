package org.example.stream.advanced;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharWithMaxFreq {

    public static void main(String[] args) {

        String s = "HEllooooo how are youuuuuuuuuuuu";
        Optional<Map.Entry<Character, Long>> maxCharFreq = s.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(maxCharFreq);
    }
}
