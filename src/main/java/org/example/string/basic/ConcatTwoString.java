package org.example.string.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoString {
    public static void main(String[] args) {

        String str = "Ujwala";
        String str1 = "Kabadi";
        String str2 = str+ " " + str1;

        System.out.println(str2);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> intList = nums.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(intList);

        List<String> countries = Arrays.asList("india", "usa", "uk", "eu", "rus", "jpn", " ", null, "");

        List<String> filteredCountries = countries.stream().filter(x -> x != null && x.length() > 0 && x != " " ).toList();
        System.out.println(filteredCountries);

        List<String> countriesWithUpperCase = filteredCountries.stream().map(x -> x.toUpperCase()).toList();
        System.out.println(countriesWithUpperCase);

        long count = filteredCountries.stream().filter(x -> x.charAt(0) == 'u').count();
        System.out.println(count);

        String longestStr = filteredCountries.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestStr);


        String s = "banana";


        Map<String, Long> freqChar = s.chars()
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(freqChar);

        List<List<String>> nested = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c"));
        List<String> li = nested.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(li);

        List<String> words = Arrays.asList("a", "to", "the", "cat");


    }
}
