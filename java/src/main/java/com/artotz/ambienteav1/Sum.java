package com.artotz.ambienteav1;

public class Sum {
    public static int sumArray(int[] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("O tamanho de n deve ser maior que zero.");
        }

        int sum = 0;
        for (int number: numbers){
            sum += number;
        }
        return sum;

    }
}
