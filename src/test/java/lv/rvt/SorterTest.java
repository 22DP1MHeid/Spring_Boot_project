package lv.rvt;

import org.junit.Test;

import rvt.Sorter;

import static org.junit.Assert.assertEquals;

public class SorterTest {
    
    @Test
    public void testSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};

        assertEquals(2, Sorter.smallest(intArray));

    }

    @Test
    public void indexOfSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};

        assertEquals(5, Sorter.indexOfSmallest(intArray));
    }
}


