package com.learning.corejava.AccessModifiersPart2;

import com.learning.corejava.AccessModifiersPart1.A;

public class C {
    public static void main(String[] args) {

        A obj1 = new A();
        // System.out.println(obj1.i); //cannot access the default variable in diff package
        // obj1.getData();//cannot access the default method in diff package

        System.out.println(obj1.j);//accessed the public variable in diff package
        obj1.publicMethod();// accessed the public method in diff package

        //System.out.println(obj1.k);// cannot access the private variable in diff package
        //obj1.privateMethod();// cannot access the private method in diff package

        // System.out.println(obj1.l);//cannot access the protected variable in diff package
        //obj1.protectedMethod();//cannot access the protected method in diff package

    }


}
