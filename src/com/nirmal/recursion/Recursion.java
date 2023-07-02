package com.nirmal.recursion;

public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int n = 5;
        System.out.println("Factorial of " + n + ": "
                + recursion.factorial(n));
        System.out.print("Fibbonacci of " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(recursion.fibbonacci(i) + " ");
        }
    }

    private int factorial(int n) {
        //base case
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private int fibbonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibbonacci(n - 1) + fibbonacci(n - 2));
        }
    }
}