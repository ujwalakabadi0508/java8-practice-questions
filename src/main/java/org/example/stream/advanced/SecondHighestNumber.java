package org.example.stream.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> elements = Arrays.asList(1,2,3,4,5,6,7,8,8,88,9);

        //this for max number
        Integer maxElement = elements.stream().max(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("Element not found"));
        System.out.println(maxElement);

        //find second highest
        elements.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

    }
}
