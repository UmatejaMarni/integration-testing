package PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PrintAllNames_In_A_List_Using_Streams {


    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        names.add("umateja");
        names.add("marni");
        names.add("skilled");
        names.add("talented");
        names.add("gorgeous");
        //print all names using stream
        names.stream().forEach(s->System.out.println(s));
        //print all names using stream
        Stream.of("umateja","marni","best","excellent","Gorgeous").forEach(s->System.out.println(s));
        //print names which has length>5
        names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
        //print names which has length>7 and print only one name
        names.stream().filter(s->s.length()>7).limit(1).forEach(s->System.out.println(s));


    }

}
