package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem7 {
    public void pattern7(int n) {
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++) {
                //spaces
                System.out.print(" ");
            }

                for(int k=0;k<2*i+1;k++){
                    //stars
                    System.out.print("*");
                }


                System.out.println();







        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem7 sol = new Problem7();
        sol.pattern7(n);
        sc.close();


    }
}