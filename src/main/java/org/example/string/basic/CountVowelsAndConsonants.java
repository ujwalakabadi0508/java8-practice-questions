package org.example.string.basic;

import java.util.stream.Collectors;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        String str = "Namste, How was your day, it went well or not?";
        long countVowels = str.chars().mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
        System.out.println(countVowels);
        long countCosonants = str.chars().mapToObj(ch -> (char)ch)
                .filter(ch -> !("aeiou".indexOf(ch) != -1))
                .count();
        System.out.println(countCosonants);
    }
}
