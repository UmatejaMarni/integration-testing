package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem6 {
    public void pattern6(int n) {

        for(int i=0;i<n;i++){

            for(int j=1;j<=n-i;j++){

                System.out.print(j);

            }
            System.out.println();
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem6 sol = new Problem6();
        sol.pattern6(n);
        sc.close();




    }
}