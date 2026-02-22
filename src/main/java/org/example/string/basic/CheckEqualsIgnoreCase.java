package org.example.string.basic;

import java.util.List;
import java.util.stream.Collectors;

public class CheckEqualsIgnoreCase {
    public static void main(String[] args) {

        String str = "Ujwala";
        String str1 = "uJWAla";

        String ignoreCase = str.chars().mapToObj(ch -> String.valueOf((char) ch).toLowerCase())
                .collect(Collectors.joining());
        String ignoreCase2 = str1.chars().mapToObj(ch -> String.valueOf((char) ch).toLowerCase())
                .collect(Collectors.joining());
        System.out.println(ignoreCase.equals(ignoreCase2));

        //using java 7

        System.out.println(ignoreCase.equalsIgnoreCase(ignoreCase2));


        }
}
