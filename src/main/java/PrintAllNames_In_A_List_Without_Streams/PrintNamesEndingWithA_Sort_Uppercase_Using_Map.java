package PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNamesEndingWithA_Sort_Uppercase_Using_Map {
    public static void main(String[] args){

       ArrayList<String> names = new ArrayList<String>();
       names.add("rama");
       names.add("sita");
       names.add("krishna");
       names.add("rukmini");
       //print the names ends with "a" and print them in uppercase
       names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
       //convert arrays to List and then stream and starts with u and sort and convert to uppercase and print
        List<String> ab= Arrays.asList("Uma","Umbrealla","Ultra","union","tax");
        ab.stream().filter(s->s.startsWith("U")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));













    }


}
