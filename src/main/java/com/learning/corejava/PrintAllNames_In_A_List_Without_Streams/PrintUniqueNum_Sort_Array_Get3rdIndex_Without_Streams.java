package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class PrintUniqueNum_Sort_Array_Get3rdIndex_Without_Streams {

    public static void main(String[] args) {
        int a[] = {3, 2, 2, 7, 5, 1, 9, 7};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer i : a) {
            list.add(i);
        }
        //converted the list to set to remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);

        //converting the set back to list
        ArrayList<Integer> sortedList = new ArrayList<Integer>(set);

        Collections.sort(sortedList);

        for (Integer i : sortedList) {
            System.out.println(i);
        }
        if (sortedList.size() >= 3){
            System.out.println("3rd index is "+sortedList.get(3));
        }

    }
}
