package com.artotz.ambienteav1;

public class QuickSort {

    public static void quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        quickSortRecursive(array, 0, length - 1);
    }

    private static void quickSortRecursive(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);

            quickSortRecursive(array, left, pivotIndex - 1);
            quickSortRecursive(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }
    
}