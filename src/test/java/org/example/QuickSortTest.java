package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @Test
    void should_return_array_with_highest_number_at_last_position() {
        //given
        int[] array = {99, 1, 22, 44, 3, 2, 5, 1};
        //when
        int[] arrayAfterSorting = quickSort.sortNumbers(array);
        //then
        int lastNumber = arrayAfterSorting.length - 1;
        assertThat(arrayAfterSorting[lastNumber]).isEqualTo(99);
    }

    @Test
    void should_return_array_with_lowest_number_at_first_position() {
        //given
        int[] array = {99, 11, 22, 44, 31, 22, 52, 10, 2};
        //when
        int[] arrayAfterSorting = quickSort.sortNumbers(array);
        //then
        assertThat(arrayAfterSorting[0]).isEqualTo(2);
    }

    @Test
    void should_return_array_with_the_same_length() {
        //given
        int[] array = {99, 11, 22, 44, 31, 22, 52, 10, 2, 22, 36, 11, 877, 3, 222, 4343};
        //when
        int[] arrayAfterSorting = quickSort.sortNumbers(array);
        //then
        assertThat(array.length).isEqualTo(arrayAfterSorting.length);
    }

    @Test
    void should_return_array_with_the_same_numbers() {
        //given
        int[] array = {99, 11, 22, 44, 31, 22, 52, 10, 2, 22, 36, 11, 877, 3, 222, 4343};
        //when
        int[] arrayAfterSorting = quickSort.sortNumbers(array);
        //then
        assertThat(arrayAfterSorting).containsExactlyInAnyOrder(array);
    }

    @Test
    void should_return_sorted_array() {
        //given
        int[] array = {99, 11, 22, 44, 31, 22, 52, 10, 2, 22, 36, 11, 877, 3, 222, 4343};
        //when
        int[] arrayAfterSorting = quickSort.sortNumbers(array);
        //then
        assertThat(arrayAfterSorting).isSorted();
    }

}