package PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrayList_Sort_FindMatch_Using_Streams {

    public static void main(String[] args){


        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("honey");
        list1.add("bunny");
        list1.add("munchkin");
        list1.add("uma");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("uma");
        list2.add("teja");
        list2.add("beautiful");
        list2.add("charming");

        Stream<String> ab = Stream.concat(list1.stream(),list2.stream());
        //ab.sorted().forEach(s->System.out.println(s));

        boolean flag=ab.anyMatch(s->s.equalsIgnoreCase("uma"));
        System.out.println("flag is "+flag);

        /*now instead of commenting the ab line bcoz its already consumed and
        we cant operate on that stream again, we can convert to list and use it without
        commenting that line
         */

        List<String> newlist = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        newlist.stream().sorted().forEach(s->System.out.println(s));

        boolean flag1 = newlist.stream().anyMatch(s->s.equalsIgnoreCase("uma"));
        System.out.println("flag1 is "+flag1);













    }













}
