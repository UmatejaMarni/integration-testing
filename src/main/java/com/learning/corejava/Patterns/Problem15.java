package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem15 {
    public void pattern15(int n) {
        for(int i=0;i<n;i++){

            for(char ch='A';ch<'A'+(n-i);ch++){

                System.out.print(ch);
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem15 sol = new Problem15();
        sol.pattern15(n);
        sc.close();
    }
}