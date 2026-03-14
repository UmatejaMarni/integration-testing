package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem10 {
    public void pattern10(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print("*");
            }
            System.out.println();


        }



    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem10 sol = new Problem10();
        sol.pattern10(n);
        sc.close();
    }
}
