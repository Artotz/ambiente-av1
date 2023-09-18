package com.artotz.ambienteav1;

public class Fibonacci {
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que zero.");
        }
        
        if (n == 1 || n == 2) {
            return 1;
        }
        
        int fib1 = 1;
        int fib2 = 1;
        int result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        
        return result;
    }
}
