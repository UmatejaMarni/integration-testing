package com.learning.corejava.Collections.InterviewQuestion;

public class UniqueNumberInAnArraywithoutArrayList {

    public static void main(String[] args){
        int a[] = {4,5,5,5,4,6,6,9,4};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            int k=0;
            if(b[i]==0)
            {
                k++;
        for(int j=i+1;j<a.length;j++)
        {
            if (a[i] == a[j])
            {
                k++;
               b[j]=1;
            }

        }
                System.out.println(a[i] + "is present" + k + "times");
        if(k==1)
            System.out.println(a[i] + "is unique number");

             }


        }


    }



}
