package rvt;

import java.util.Arrays;

public class Sorter {
    
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempNum = array[index1];
        
        array[index1] = array[index2];
        array[index2] = tempNum;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

    public static void builtInSorter(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searched) {
        int begin = 0;
        int end = array.length;

        while (begin < end) {
            int middle = (end + begin) / 2;

            if (array[middle] == searched) {
                return array[middle];
            }

            if (array[middle] < searched) {
                begin = middle + 1;
            }

            if (array[middle] > searched) {
                end = middle - 1;
            }
        }
        return -1;
    }
}
