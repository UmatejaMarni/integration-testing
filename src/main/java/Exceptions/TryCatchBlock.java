package Exceptions;

public class TryCatchBlock {

    public static void main(String[] args){

        int a =1;
        int b=0;
        try{

            System.out.println(a/b);
        }

        catch(ArithmeticException e){

            System.out.println("arithmetic exceptions");
        }
        catch(Exception e){

            System.out.println("all exceptions");

        }
    }










}
