package com.learning.corejava.PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CountTheNumberOfNamesStartingWithA_IN_A_List_UsingStreams {


    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        names.add("Arun");
        names.add("Akshay");
        names.add("bheema");
        names.add("charu");
        names.add("sarath");

        //create a stream from the names object of ArrayList collection
        long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println("countOFnames starting with A by creating stream from names obj of collection is " + c);

        //create a stream directly with given names
        long d = Stream.of("Arun", "Akshay", "bheema", "charu", "sarath").filter(s -> s.startsWith("A")).count();
        System.out.println("count of names starting with A by creating stream directly is " + d);

        //experimenting with lambda block
        long e = Stream.of("Arun", "Akshay", "bheema", "charu", "sarath").
                filter(s ->
                {
                    s.startsWith("A");//wrote a block but didnt use the result of it and since we always return true it passes every element
                    return true;
                }).count();
        System.out.println("this prints count of all names since the condition is evaluated but ignored is " + e);

        //lambda block to print names starting with letter A and also print the count
        long f = Stream.of("Arun", "Akshay", "bheema", "charu", "sarath").filter(s -> {
            boolean actual = s.startsWith("A");
            if (actual) {
                System.out.println("printing the names starting with A is " + s);
            }
            return actual;
        }).count();
        System.out.println("count of names starting with A by using lambda block is " + f);

        //lambda expression to print names starting with letter A and also print the count
        //forEach(...) is a terminal operation.Its return type is void — it doesn’t produce a value you can assign.That’s why you can’t store the result in long g.
        Stream.of("Arun", "Akshay", "bheema", "charu", "sarath").filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));

    }
}