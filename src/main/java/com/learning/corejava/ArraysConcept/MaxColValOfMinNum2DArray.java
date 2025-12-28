package com.learning.corejava.ArraysConcept;

public class MaxColValOfMinNum2DArray {
    public static void main (String[] args){
        int a[][] = {{2,4,0},{3,4,7},{1,2,9}};
        int min=a[0][0];
        int mincol = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]<min){
                    min = a[i][j];
                    mincol=j;

                }

            }
        }
        System.out.println("min value is "+min);
        System.out.println("min value column number is "+mincol);
        int maxincol = a[0][mincol] ;
        for(int k=0;k<a.length;k++){
            if(a[k][mincol]>maxincol)
                maxincol= a[k][mincol];
        }
        System.out.print("max value in column of a min num is "+maxincol);




    }





}
