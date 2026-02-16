package org.example.stream.intermediate;

import java.util.stream.Stream;

public class CountVowels {
    public static void main(String[] args) {

        //Count vowels in a sentence using streams
        String s = "Hello Ujwala How are youuu ?";
        long totalVowels = s.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch)!=-1).count();
        System.out.printf("Toatl count of Vowels "+ totalVowels);
    }
}
