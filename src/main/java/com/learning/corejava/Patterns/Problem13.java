package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem13 {
    public void pattern13(int n) {
        int num=1;

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){

                System.out.print(num+" ");
                num++;

            }
            System.out.println();



        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem13 sol = new Problem13();
        sol.pattern13(n);
        sc.close();
    }
}
