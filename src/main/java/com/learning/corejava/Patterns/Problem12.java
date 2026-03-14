package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem12 {
    public void pattern12(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            for(int k=1;k<=2*(n-(i-1))-2;k++){

                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            System.out.println();
        }



    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem12 sol = new Problem12();
        sol.pattern12(n);
        sc.close();
    }
}