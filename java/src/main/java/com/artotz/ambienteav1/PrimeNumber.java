package com.artotz.ambienteav1;

public class PrimeNumber {
    public static boolean isPrime( int number){
        if (number <= 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que zero.");
        }

        if( number % 2 == 0)
            return false;

        int divisor = 3;
        while(divisor < number){
            if(number % divisor == 0)
                return false;
            divisor += 2;
        }

        return true;
    }
}
