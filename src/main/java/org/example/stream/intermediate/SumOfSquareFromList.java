package org.example.stream.intermediate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Find sum of squares of even numbers from a list
        int sumOfList = list.stream().filter(l -> l % 2 == 0).mapToInt(Integer::intValue).sum();
        sumOfList = sumOfList*sumOfList;
        System.out.println(sumOfList);

        //Second Way
        
    }
}
