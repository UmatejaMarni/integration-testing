package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;

public class CountTheNumberOfNamesStartingWithA_IN_A_List_Without_Streams {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        names.add("Arun");
        names.add("Akshay");
        names.add("bheema");
        names.add("charu");
        names.add("sarath");
        int count=0;
        for(int i=0;i< names.size();i++){

             String actual =  names.get(i);
             if(actual.startsWith("A")){
                 count++;
             }
        }
        System.out.println("count of the number of names starting with A is "+count);

    }

}
