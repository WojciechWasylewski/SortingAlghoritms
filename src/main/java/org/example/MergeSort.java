package org.example;

public class MergeSort implements SortingAlgorithm {

    @Override
    public int[] sortNumbers(int[] array) {
        int l = array.length;
        if (l < 2) {
            return array;
        }
        int midIdex = l / 2;
        int[] leftArray = new int[midIdex];
        int[] rightArray = new int[l - midIdex];

        System.arraycopy(array, 0, leftArray, 0, midIdex);

        if (l - midIdex >= 0) System.arraycopy(array, midIdex, rightArray, midIdex - midIdex, l - midIdex);

        sortNumbers(leftArray);
        sortNumbers(rightArray);

        merge(array, leftArray, rightArray);
        return array;
    }

    private void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int riightSize = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < riightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < riightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
