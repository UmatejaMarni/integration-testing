package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem11 {
    public void pattern11(int n) {
        int Start=0;

        for(int i=0;i<n;i++){

            if(i%2==0)
                Start=0;
            else
                Start =1;
            for(int j=0;j<=i;j++){

                System.out.print((Start=1-Start)+" ");


            }
            System.out.println();



        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem11 sol = new Problem11();
        sol.pattern11(n);
        sc.close();
    }
}