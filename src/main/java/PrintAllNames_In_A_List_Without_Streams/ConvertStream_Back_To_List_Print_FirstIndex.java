package PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStream_Back_To_List_Print_FirstIndex {


    public static void main(String[] args){

       String firstindex= Stream.of("amu","uma","teja","happiness")
               .filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList()).get(0);
       System.out.println("firstindex is "+firstindex);











    }









}
