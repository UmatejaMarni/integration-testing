package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem14 {
    public void pattern14(int n) {


        for(int i=0;i<n;i++){

            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);

            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem14 sol = new Problem14();
        sol.pattern14(n);
        sc.close();
    }
}