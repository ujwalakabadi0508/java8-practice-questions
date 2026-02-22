package org.example.string.basic;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperCase {
    public static void main(String[] args) {

        String str = "Hello Ujwla, hope you are doing good?";
        String uppercase = str.toUpperCase();
        str.chars().mapToObj(
                ch -> String.valueOf((char) ch).toUpperCase()).collect(Collectors.joining());
        System.out.println(uppercase);

    }
}
