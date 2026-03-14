package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem4{
    public void pattern4(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(i);



            }
            System.out.println();



        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem4 sol = new Problem4();
        sol.pattern4(n);
        sc.close();



    }
}