package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSortedArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Array should remain sorted.");
    }

    @Test
    public void testReverseSortedArray() {
        int[] numbers = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Array should be sorted in ascending order.");
    }

    @Test
    public void testUnsortedArrayWithDuplicates() {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Array with duplicates should be sorted correctly.");
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] numbers = {10};
        int[] expected = {10};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Array with one element should remain unchanged.");
    }

    @Test
    public void testArrayWithAllSameElements() {
        int[] numbers = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Array with all the same elements should remain unchanged.");
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        int[] expected = {};
        Task3.bubbleSort(numbers);
        assertArrayEquals(expected, numbers, "Empty array should remain unchanged.");
    }
}
