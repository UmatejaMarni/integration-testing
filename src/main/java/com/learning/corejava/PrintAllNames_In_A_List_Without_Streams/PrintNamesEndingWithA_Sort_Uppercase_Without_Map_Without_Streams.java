package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.Collections;

public class PrintNamesEndingWithA_Sort_Uppercase_Without_Map_Without_Streams {


    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        names.add("rama");
        names.add("sita");
        names.add("krishna");
        names.add("rukmini");

        //print the names ends with "a" and print them in uppercase
        for(String name:names){
            if(name.endsWith("a"))
                System.out.println("printing the names ending with a "+name.toUpperCase());

        }
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Uma");
        names2.add("Umbrealla");
        names2.add("Ultra");
        names2.add("union");
        names2.add("tax");
        //print names that starts with u and sort and convert to uppercase and print
        ArrayList<String> newlist = new ArrayList<String>();
        for(String name:names2){
            if(name.startsWith("U"))
                newlist.add(name);

        }
        Collections.sort(newlist);
        for(String name:newlist){
        System.out.println("print names that starts with u and sort and convert to uppercase and print "+name.toUpperCase());

        }




    }
}
