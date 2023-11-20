package org.example;

import java.util.Random;

public class ArrayGenerator {

    public int[] generateRandomNumberArray(int size, int bound) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound + 1);
        }
        return array;
    }
}