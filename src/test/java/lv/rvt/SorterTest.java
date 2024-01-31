package lv.rvt;

import org.junit.Test;

import rvt.Sorter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SorterTest {
    
    @Test
    public void testSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};

        assertEquals(2, Sorter.smallest(intArray));

    }

    @Test
    public void testIndexOfSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};

        assertEquals(5, Sorter.indexOfSmallest(intArray));
    }

    @Test
    public void testIndexOfSmallestFrom() {
        int[] intArray = {3, 5, 1, 6, 7, 10, 24, 5, 1};
        int startIndex = 3;
        
        assertEquals(8, Sorter.indexOfSmallestFrom(intArray, startIndex));
    }

    @Test
    public void testSwap() {
        int[] intArray = {3, 5, 1, 6, 7, 10, 24, 5, 1};
        int[] resultingArray = {3, 5, 1, 6, 24, 10, 7, 5, 1};
        int index1 = 4;
        int index2 = 6;
        Sorter.swap(intArray, index1, index2);

        assertArrayEquals(resultingArray, intArray);
    }

    @Test
    public void testSort() {
        int[] intArray = {4, 9, 2, 3, 1, 5, 7, 6, 8};
        int[] resultingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sorter.sort(intArray);
        assertArrayEquals(resultingArray, intArray);
    }

    @Test
    public void testBuiltInSorter() {
        int[] intArray = {4, 9, 2, 3, 1, 5, 7, 6, 8};
        int[] resultingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Sorter.builtInSorter(intArray);
        assertArrayEquals(resultingArray, intArray);
    }

    @Test
    public void testLinearSearch() {
        int[] intArray = {4, 9, 2, 3, 1, 5, 7, 6, 8};
        int searched = 3;

        assertEquals(3, Sorter.linearSearch(intArray, searched));
    }
}