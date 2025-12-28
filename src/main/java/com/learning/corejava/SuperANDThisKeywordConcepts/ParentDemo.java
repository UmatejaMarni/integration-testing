package com.learning.corejava.SuperANDThisKeywordConcepts;

public class ParentDemo {
    int a=4,b=5;
    String name="uma";
    public ParentDemo(){
        System.out.println("parent constructor");

    }
    public void getData(){
        System.out.println("parent method");
        System.out.println(a+b);

    }
}
