package ConstructorConcepts;

public class CosntructorDemo {
    public CosntructorDemo(){

        System.out.println("i am inside the default cosntructor");
    }

    public void getData(){

        System.out.println("i am inside the method");
    }

    public static void main(String[] args){

        CosntructorDemo cd = new CosntructorDemo();

    }
}
