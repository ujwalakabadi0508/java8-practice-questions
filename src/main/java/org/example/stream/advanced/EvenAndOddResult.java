package org.example.stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAndOddResult {

    public static void main(String[] args) {
        //12. Partition numbers into even and odd in one pass
        List<Integer> evenAndOdd = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> evenOddPartitioning = evenAndOdd.stream()
                .collect(Collectors.partitioningBy(evenOdd -> evenOdd % 2 == 0));
        System.out.println(evenOddPartitioning);
    }
}
