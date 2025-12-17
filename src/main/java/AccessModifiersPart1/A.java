package AccessModifiersPart1;

public class A {

    int i = 4;  //default variable
    void getData() {
        System.out.println("default method");
    }

    public int j = 4;  //public variable
    public void publicMethod() {
        System.out.println("public method");
    }

    private int k = 5; //private variable
    private void privateMethod () {
        System.out.println("private method");
    }

    protected int l=6;
    protected void protectedMethod(){
        System.out.println("protected method");
    }

    public static void main(String[] args) {

        A obj1 = new A();
        System.out.println(obj1.i); // accessed the default variable in same class
        obj1.getData();// accessed the default variable in same class

        System.out.println(obj1.j);// accessed the public variable  in same class
        obj1.publicMethod();// accessed the public method in same class

        System.out.println(obj1.k);// accessed the private variable in same class
        obj1.privateMethod();// accessed the private method in same class

        System.out.println(obj1.l);// accessed the protected variable in same class
        obj1.protectedMethod();// accessed the public method in same class


    }


}
