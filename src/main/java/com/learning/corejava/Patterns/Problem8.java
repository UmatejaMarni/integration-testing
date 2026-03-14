package com.learning.corejava.Patterns;

import java.util.Scanner;

public class Problem8 {
    public void pattern8(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }
            for (int j = 0; j < 2 * (n-i) - 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem8 sol = new Problem8();
        sol.pattern8(n);
        sc.close();


    }
}
