package rvt;

public class Sorter {
    
    public static int testSmallest() {
        int[] intArray = {3, 5, 10, 500, 17, 2};
        int smallest = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
        }
        return smallest;
    }
}

