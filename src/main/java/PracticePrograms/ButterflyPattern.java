package PracticePrograms;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 3;

        // Upper half
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                // Left wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Spaces between wings
                int space = (i == 1) ? 3 : 1;
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                // Right wing
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // Middle row: exactly 5 stars
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between wings
            int space = (i == 1) ? 3 : 1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
