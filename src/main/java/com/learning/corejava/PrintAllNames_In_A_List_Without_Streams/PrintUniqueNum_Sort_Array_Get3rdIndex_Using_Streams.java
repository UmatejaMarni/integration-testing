package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueNum_Sort_Array_Get3rdIndex_Using_Streams {
public static void main(String[] args) {
    int a[] = {3, 2, 2, 7, 5, 1, 9, 7};

    List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
    int unique = numbers.stream().distinct().sorted().collect(Collectors.toList()).get(2);
    System.out.println(unique);


}



}
