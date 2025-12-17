package AccessModifiersPart1;

public class B {


    public static void main(String[] args) {

        A obj1 = new A();
        System.out.println(obj1.i); // accessed the default variable with in same package
        obj1.getData();// accessed the default variable with in same package

        System.out.println(obj1.j);// accessed the public variable with in same package
        obj1.publicMethod();// accessed the public method with in same package

        //System.out.println(obj1.k);// cannot access the private variable with in same package
        //obj1.privateMethod();// cannot access the private method with in same package

        System.out.println(obj1.l);// accessed the protected variable with in same package
        obj1.protectedMethod();// accessed the public method with in same package


    }


}
