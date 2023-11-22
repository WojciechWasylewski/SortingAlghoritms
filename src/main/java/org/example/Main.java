package org.example;

public class Main {
    public static void main(String[] args) {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();


        int[] array = arrayGenerator.generateRandomNumberArray(900, 10000);

        System.out.println("Array before sorting:");
        arrayPrinter.printArray(array);
        System.out.println();
        quickSort.sortNumbers(array);
        System.out.println("Array after sorting:");
        arrayPrinter.printArray(array);

    }

}