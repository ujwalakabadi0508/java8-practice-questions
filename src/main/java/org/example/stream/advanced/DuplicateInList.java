package org.example.stream.advanced;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInList {
    public static void main(String[] args) {

        HashSet<String> seen = new HashSet<>();
        //13. Find the duplicate elements in a list
        List<String> list = Arrays.asList("to", "to", "Two", "three", "two");
        List<String> removeDuplicate = list.stream().filter(n -> !seen.add(n.toLowerCase()))
                .distinct().collect(Collectors.toList());
        System.out.println(removeDuplicate);

    }
}
