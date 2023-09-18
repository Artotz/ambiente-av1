package com.artotz.ambienteav1;

public class WholeNumbers {
    public static int countWholeNumbers(float[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int count = 0;

        for (float number : numbers) {
            if (number % 1 == 0) { // Verifica se o número é um inteiro
                count++;
            }
        }

        return count;
    }
}
