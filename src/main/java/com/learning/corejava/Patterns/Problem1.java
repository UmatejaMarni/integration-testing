package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem1 {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem1 sol = new Problem1();
        sol.pattern1(n);
        sc.close();


    }
}