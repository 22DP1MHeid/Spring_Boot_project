package lv.rvt;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SorterTest {
    
    @Test
    public void testSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};
        int smallest = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
        }
        System.out.println(smallest);
    }
}


