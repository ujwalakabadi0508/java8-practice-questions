package org.example.string.basic;

import java.util.function.Predicate;

public class CompareTwoString {

    public static void main(String[] args) {
        String str = "Hello";
        Predicate<String> compareStr = str1 -> str1 == str;
        System.out.println(compareStr.test("Hello1"));

        Predicate<String> usingEquals = str1 -> str1.equals(str);
        System.out.println(compareStr.test("Hello"));
    }
}
