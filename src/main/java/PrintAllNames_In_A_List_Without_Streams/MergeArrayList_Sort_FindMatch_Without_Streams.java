package PrintAllNames_In_A_List_Without_Streams;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArrayList_Sort_FindMatch_Without_Streams {


    public static void main(String[] args) {

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

        ArrayList<String> mergedList = new ArrayList<String>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        for(String name:mergedList){
            System.out.println("sorted merged list is "+name);
        }

        boolean flag=false;
        for(String name:mergedList){

            if(name.contains("uma"))
               flag =true;
            break;

        }
        System.out.println("match is "+flag);
        //below for loop is code to find the common elements
        for(String name:list1){

            if(list2.contains(name))
                System.out.println("match is "+name);
        }

    }


}
