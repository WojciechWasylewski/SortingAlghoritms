package org.example;

public class Main {
    public static void main(String[] args) {
        SorrtingNumbers sorrtingNumbers = new SorrtingNumbers();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        int[] array = arrayGenerator.generateRandomNumberArray(101, 100);

        System.out.println("Array before sorting:");
        arrayPrinter.printArray(array);
        System.out.println();
        System.out.println("Array after sorting:");
        sorrtingNumbers.bubbleSort(array);
        arrayPrinter.printArray(array);

    }

}