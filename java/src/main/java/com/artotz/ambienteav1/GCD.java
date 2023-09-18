package com.artotz.ambienteav1;

public class GCD {
    public static int calculateGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return calculateGCD(n2, n1 % n2);
    }
}
