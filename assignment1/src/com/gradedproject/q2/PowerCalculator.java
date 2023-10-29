package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number X: ");
        int x = scanner.nextInt();

        System.out.print("Enter the power N: ");
        int n = scanner.nextInt();

        // Calculate X raised to the power N using the power() method
        int result = power(x, n);

        // Display the result
        System.out.println("X power N is: " + result);
    }

    // Recursive function to calculate X to the power of N
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            // Recursively calculate X^n as X * X^(n-1)
            return x * power(x, n - 1);

        }
    }
}