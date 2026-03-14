package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem5 {
    public void pattern5(int n) {
        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                System.out.print("*");


            }
            System.out.println();

        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem5 sol = new Problem5();
        sol.pattern5(n);
        sc.close();




    }
}
