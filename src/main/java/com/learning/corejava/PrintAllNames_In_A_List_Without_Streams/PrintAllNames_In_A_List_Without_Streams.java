package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;

public class PrintAllNames_In_A_List_Without_Streams {


    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        names.add("umateja");
        names.add("marni");
        names.add("skilled");
        names.add("talented");
        names.add("gorgeous");

        for (String name : names) {
            System.out.println(name);
        }

            for(String name1: names){
                if(name1.length()>5)
                    System.out.println("length greater than 5 is "+name1);

            }

            for(String name2:names){

                if(name2.length()>7) {
                    System.out.println("printing only one name "+name2);
                    break;
                }
            }

    }


}
