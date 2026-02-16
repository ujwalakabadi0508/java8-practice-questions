package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
    public static void main(String[] args) {

        //12. Sort a list of strings ignoring case
        List<String> strList = Arrays.asList("Akshu","Ujju","bharati","Nikita",
                "Jayashree","Laxman","Ganesh","Saanvi","Shila");
        List<String> sortedList = strList.stream().sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
