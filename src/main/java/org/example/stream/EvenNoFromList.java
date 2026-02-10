package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoFromList {
    public static void main(String[] args) {
        //Filter even numbers from a list

        List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> listOfEvenNo = lists.stream().filter(list -> list % 2 == 0)
                .collect(Collectors.toList());

        listOfEvenNo.forEach(System.out::println);
    }
}
