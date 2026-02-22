package org.example.string.basic;

import java.util.stream.Collectors;

public class RemoveAllSpaces {
    public static void main(String[] args) {

        String str = "Hello Alex, I am Ujwala, work as software developer";
        String removeAllSpaces = str.chars().filter(ch -> !Character.isWhitespace(ch))
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());

        System.out.println(removeAllSpaces);
    }
}
