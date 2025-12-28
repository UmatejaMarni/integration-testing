package com.learning.corejava.ConstructorConcepts;

public class ParameterizedCosntructorDemo {

    public ParameterizedCosntructorDemo(){

        System.out.println("i am inside the default cosntructor");
    }

    public ParameterizedCosntructorDemo(int a , int b){

        System.out.println("i am inside the param cosntructor");
        int c=a+b;
        System.out.println(c);
    }


    public ParameterizedCosntructorDemo(String str){

        System.out.println(str);
    }

  public static void main (String[] args){

      ParameterizedCosntructorDemo pc = new ParameterizedCosntructorDemo();
      ParameterizedCosntructorDemo pc1 = new ParameterizedCosntructorDemo(2,4);
      ParameterizedCosntructorDemo pc2 = new ParameterizedCosntructorDemo("hello");

}





}
