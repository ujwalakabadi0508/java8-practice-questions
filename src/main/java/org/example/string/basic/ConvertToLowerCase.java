package org.example.string.basic;

import java.util.stream.Collectors;

public class ConvertToLowerCase {

    public static void main(String[] args) {

        String str = "Hello Pruthvi, How are you?";
        String lowercase = str.chars().mapToObj(ch -> String.valueOf((char) ch)
                        .toLowerCase())
                .collect(Collectors.joining());
        System.out.println(lowercase);

    }
}
