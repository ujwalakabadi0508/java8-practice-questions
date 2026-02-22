package org.example.string.basic;

import java.util.stream.Collectors;

public class RemoveAllOccurenceOfChar {
    public static void main(String[] args) {

        String str = "I Love Java, So I am working Java 8";
        char removeCh = 'a';
        String removeAlloccurence = str.chars().filter(ch -> ch != removeCh)
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
        System.out.println(removeAlloccurence);
    }
}
