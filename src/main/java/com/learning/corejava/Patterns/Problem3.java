package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem3 {
    public void pattern3(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(j);


            }
            System.out.println();



        }


    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Problem3 sol = new Problem3();
        sol.pattern3(n);


    }
}
