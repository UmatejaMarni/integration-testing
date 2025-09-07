package InterfaceConcepts;

public class ImmutableStrConcept {

    public static void main (String[] args)
    {
        //Strings are immutable
        String a = "hello";
        //String b=  "hello";  // this is to explain
        a.concat("world");
        String s1= new String("good");
        //String s2= new String("good"); // this is to explain
        s1.concat("intent");
        System.out.println("a is "+a);
        System.out.println("s1 is "+s1);

        String c=a.concat("world");
        String s3 = s1.concat("intent");
        System.out.println("c is "+c);
        System.out.println("s3 is "+s3);

    }




}
