package org.example;

public class QuickSort implements SortingAlgorithm {

    public int[] sortNumbers(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivotIndex = partition(array, lowIndex, highIndex);
            sortNumbers(array, lowIndex, pivotIndex - 1);
            sortNumbers(array, pivotIndex + 1, highIndex);
        }
        return array;
    }

    private int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int leftPointer = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] <= pivot) {
                leftPointer++;
                swap(array, leftPointer, j);
            }
        }

        swap(array, leftPointer + 1, highIndex);
        return leftPointer + 1;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public int[] sortNumbers(int[] array) {
        return sortNumbers(array, 0, array.length - 1);
    }
}
