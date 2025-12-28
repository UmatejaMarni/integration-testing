package com.learning.corejava.SuperANDThisKeywordConcepts;

public class ThisKeywordDemo {

    int a =2;
    public void getData(){

        int a =3;
        System.out.println(this.a+a);

    }

    public static void main(String[] args){

        ThisKeywordDemo tk = new ThisKeywordDemo();
        tk.getData();

    }


}
