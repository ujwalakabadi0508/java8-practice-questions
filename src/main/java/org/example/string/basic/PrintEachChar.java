package org.example.string.basic;

public class PrintEachChar {
    public static void main(String[] args) {

        String  s = "Ujwala";
        s.chars().mapToObj(
                ch -> (char) ch
        ).forEach(System.out::println);
    }
}
