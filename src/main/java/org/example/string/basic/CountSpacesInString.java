package org.example.string.basic;

import java.util.stream.Stream;

public class CountSpacesInString {
    public static void main(String[] args) {
        String s = "Hello, Mom, Papa and akshu, I love you so much...";
       Long countSpaces = s.chars().mapToObj(ch -> (char)ch).filter(ch -> ch == ' ').count();
        System.out.println(countSpaces);

    }
}
