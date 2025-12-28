package com.learning.corejava.InheritanceConcepts;

public class MainClass {


    public static void main(String[] args){


        A obj1 = new B();
        B obj2 = new B();
        System.out.println(obj1.i);// prints 10
        System.out.println(obj2.i);//prints 20

    }



}
