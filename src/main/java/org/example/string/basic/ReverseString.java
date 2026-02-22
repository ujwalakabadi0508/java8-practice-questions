package org.example.string.basic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ujwala Kabadi";
        StringBuilder strBul = new StringBuilder(str);
        strBul.reverse();
        System.out.println(strBul);
    }
}
