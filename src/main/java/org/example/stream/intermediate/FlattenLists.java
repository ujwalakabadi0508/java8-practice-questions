package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),
                Arrays.asList(3,4), Arrays.asList(5,6));
        List<Integer> flattenList = list.stream().flatMap(List::stream).collect(Collectors.toList());
        flattenList.forEach(f -> System.out.printf("Flaten List %d%n",f));

    }
}
