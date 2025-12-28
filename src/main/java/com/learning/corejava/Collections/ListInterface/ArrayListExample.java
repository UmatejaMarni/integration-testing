package com.learning.corejava.Collections.ListInterface;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){

        ArrayList<String> a = new ArrayList<String> ();
        a.add("uma");
        a.add("teja");
        a.add("professional");
        a.add("employee");
        System.out.println(a);
        System.out.println(a.indexOf("employee"));
        System.out.println(a.get(2));
        a.remove("teja");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println (a.isEmpty());
        System.out.println(a.contains("teja"));












    }



}
