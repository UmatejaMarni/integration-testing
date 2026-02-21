package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem2 {
    public void pattern2(int n) {

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
    public static void main(String[] args){
        Scanner sn= new Scanner(System.in);
        int n = sn.nextInt();
        Problem2 sol = new Problem2();
        sol.pattern2(n);

    }



}