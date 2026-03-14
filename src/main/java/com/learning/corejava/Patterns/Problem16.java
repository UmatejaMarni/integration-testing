package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem16 {
    public void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem16 sol = new Problem16();
        sol.pattern16(n);
        sc.close();
    }
}