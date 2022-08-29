package Task_02.test;

import Task_02.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void quickSortTestMethod() {

        int[] arrInt = new int[]{5, 6, 3, 2, 5, 1, 4, 9};       // Исходный массив
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 5, 6, 9};       // Остортированный массив

        Solution.quickSort(arrInt, 0, arrInt.length - 1);
        assertArrayEquals(arrInt, sortedArray);
    }

    @Test
    void quickSortTestMethod2() {

        int[] arrInt = new int[]{0, 10, 3, 5, 12, 44, 0, 0, 10, 4, 6, 2, 8, 7};
        int[] sortedArray = new int[]{0, 0, 0, 2, 3, 4, 5, 6, 7, 8, 10, 10, 12, 44};

        Solution.quickSort(arrInt, 0, arrInt.length - 1);
        assertArrayEquals(arrInt, sortedArray);
    }
}