package com.learning.corejava.ArraysConcept;

public class Printing2DArray {
    public static void main (String[] args){
        int a[][] = {{4,5,7},{1,2,3},{8,9,3}};

        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }


        }


    }


}
