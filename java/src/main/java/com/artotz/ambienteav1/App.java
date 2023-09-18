package com.artotz.ambienteav1;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1 - Prime Number");
        System.out.println("2 - Sum");
        System.out.println("3 - Fibonacci");
        System.out.println("4 - GCD");
        System.out.println("5 - QuickSort");
        System.out.println("6 - Whole Number Count");
        System.out.println("0 - Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            System.out.print("You entered the following number: ");
            System.out.println(input);
            System.out.print("Result: The number ");
            System.out.println(PrimeNumber.isPrime(input) ? input + " is Prime." : input + " is not Prime.");
        } else if (choice == 2) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] strNumbers = input.split(" ");
            int[] numbers = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                numbers[i] = Integer.parseInt(strNumbers[i]);
            }
            System.out.print("You entered the following numbers: ");
            System.out.println(Arrays.toString(numbers));
            System.out.print("Result: The sum of these numbers is ");
            System.out.println(Sum.sumArray(numbers) + ".");

        } else if (choice == 3) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            System.out.print("You entered the following number: ");
            System.out.println(input);
            System.out.print("Result: The term " + input + " of the Fibonacci sequence is: ");
            System.out.println(Fibonacci.calculateFibonacci(input) + ".");
        } else if (choice == 4) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter the first number: ");
            int input1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int input2 = scanner.nextInt();
            System.out.print("You entered the following numbers: ");
            System.out.println(input1 + " and " + input2);
            System.out.print("Result: The GCD of " + input1 + " and " + input2 + " is ");
            System.out.println(GCD.calculateGCD(input1, input2) + ".");
        } else if (choice == 5) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] strNumbers = input.split(" ");
            int[] numbers = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                numbers[i] = Integer.parseInt(strNumbers[i]);
            }
            System.out.print("You entered the following numbers: ");
            System.out.println(Arrays.toString(numbers));
            System.out.print("Result: Here's the quicksorted list: ");
            QuickSort.quickSort(numbers);
            System.out.println(Arrays.toString(numbers));
        } else if (choice == 6) {
            System.out.println("You chose option " + choice + ".");
            System.out.print("Enter integers separated by spaces: ");
            String input = scanner.nextLine();
            String[] strNumbers = input.split(" ");
            float[] numbers = new float[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                numbers[i] = Float.parseFloat(strNumbers[i]);
            }
            System.out.print("You entered the following numbers: ");
            System.out.println(Arrays.toString(numbers));
            System.out.print("Result: The total count of whole numbers is ");
            System.out.println(WholeNumbers.countWholeNumbers(numbers) + ".");
        } else if (choice == 0) {
            System.out.println("Exiting the program.");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }

    }
}
