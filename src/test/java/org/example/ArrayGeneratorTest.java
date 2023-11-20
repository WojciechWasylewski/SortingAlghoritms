package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayGeneratorTest {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
    @Test
    public void should_return_array_with_10_numbers_when_size_is_10(){
        //given
        int size = 10;
        int bound = 100;
        //when
        int[] array =  arrayGenerator.generateRandomNumberArray(size,bound);
        //then
        assertThat(array.length).isEqualTo(10);
    }

    @Test
    public void should_return_array_with_1000_numbers_when_size_is_1000(){
        //given
        int size = 1000;
        int bound = 10000;
        //when
        int[] array =  arrayGenerator.generateRandomNumberArray(size,bound);
        //then
        assertThat(array.length).isEqualTo(1000);
    }

    @Test
    public void should_return_array_with_max_number_is_less_or_equal_to_1000(){
        //given
        int size = 100;
        int bound = 1000;
        //when
        int[] array =  arrayGenerator.generateRandomNumberArray(size,bound);
        //then
        int actualmaxValue = Arrays.stream(array).max().orElseThrow();
        assertThat(actualmaxValue).isLessThanOrEqualTo(1000);
    }

    @Test
    public void should_return_array_with_max_number_is_less_or_equal_to_1(){
        //given
        int size = 100;
        int bound = 1;
        //when
        int[] array =  arrayGenerator.generateRandomNumberArray(size,bound);
        //then
        int actualmaxValue = Arrays.stream(array).max().orElseThrow();
        assertThat(actualmaxValue).isLessThanOrEqualTo(1);
    }

    @Test
    public void should_return_array_with_no_negative_numbers(){
        //given
        int size = 10000;
        int bound = 100;
        //when
        int[] array =  arrayGenerator.generateRandomNumberArray(size,bound);
        //then
        int actualminValue = Arrays.stream(array).min().orElseThrow();
        assertThat(actualminValue).isNotNegative();
    }

}