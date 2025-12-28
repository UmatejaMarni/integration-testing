package com.learning.corejava.Collections.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {


    public static void main(String[] args){

        HashSet<String> hs = new HashSet<String>();
        hs.add("he");
        hs.add("she");
        hs.add("uma");
        hs.add("teja");
        hs.add("good girl");
        System.out.println(hs);
        hs.remove("he");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("uma"));

           Iterator<String> i = hs.iterator();
           while(i.hasNext()){

               System.out.println(i.next());

           }


    }

}
