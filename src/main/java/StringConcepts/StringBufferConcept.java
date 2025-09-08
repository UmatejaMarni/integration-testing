package StringConcepts;

public class StringBufferConcept {

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = a.concat("world");
        System.out.println("a is "+a);
        System.out.println("c is "+c);
        String s1 = new String("hello");
        String s2 = new String("hello");

        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println("sb is "+sb);
        sb.insert(2,"she");
        System.out.println("sb is "+sb);
        sb.replace(5,7,"aa");
        System.out.println("sb is "+sb);
        sb.deleteCharAt(12);
        System.out.println("sb is "+sb);
        sb.reverse();
        System.out.println("reverse string is "+sb);

        //String builder is not thread safe and its asynchronous but its fast
        //String Buffer is thread safe and asynchronous but its not that fast

        StringBuilder sc = new StringBuilder("hiuma");
        sc.append("teja");
        System.out.println("sc is "+sc);

        System.out.println(a.equals(b)); //content
        System.out.println(a==b); //reference
        System.out.println(a.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }

}
