package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineList {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Ujwala", "AKshay");
        List<String> strList2 = Arrays.asList("Kabadi", "Takke");

        List<String> strCombinedList = Stream.of(strList, strList2)
                .flatMap(List::stream).collect(Collectors.toList());
        System.out.println(strCombinedList);



    }
}
