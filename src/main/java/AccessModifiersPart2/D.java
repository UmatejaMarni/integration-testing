package AccessModifiersPart2;

import AccessModifiersPart1.A;

public class D extends A {

    public static void main(String[] args) {

        A obj1 = new A();

        // System.out.println(obj1.i); // not able to access the default variable in diff package sub-class
        // obj1.getData();// accessed the default variable with in diff package sub-class

        System.out.println(obj1.j);// accessed the public variable in diff package sub-class
        obj1.publicMethod();// accessed the public method in diff package sub-class

        //System.out.println(obj1.k);// cannot access the private variable in diff package sub-class
        //obj1.privateMethod();// cannot access the private method in diff package sub-class

        //System.out.println(obj1.l);//cannot access the protected variable with parent class reference in diff package sub-class
        //obj1.protectedMethod();//cannot access the protected variable with parent class reference in diff package sub-class

        D obj2 = new D();
        System.out.println(obj2.l);//accessed the protected variable via subclass reference in diff package
        obj2.protectedMethod();//accessed the protected method via subclass reference in diff package

    }


}
