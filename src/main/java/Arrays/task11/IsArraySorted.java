package Arrays.task11;

import java.util.Arrays;
import java.util.Collections;

public class IsArraySorted {
    public static void main(String[] args) {
        System.out.println("Is array sorted? " + isSorted());
    }

    public static boolean isSorted() {

        Integer[] array = {5, 56, 8, 23, 78, 63, 6, 42, 2, 13};

        int arrayEnd = array.length - 1;
        int counterAscending = 0;
        int counterDescending = 0;
        boolean result;

        //Arrays.sort(array);
        /* for (int values : array) {
        System.out.print(values + " "); // - можно включить, если нужно вывести уже отсортированный массив
        }*/

        // Arrays.sort(array, Collections.reverseOrder());
      /*  for (int values : array) {
            System.out.print(values + " "); // - можно включить, если нужно вывести уже отсортированный массив
        }*/

        for (int i = 0; i < arrayEnd; i++) {

            if (array[i] < array[i + 1]) {
                counterAscending++;
            } else if (array[i] > array[i + 1]) {
                counterDescending++;
            }
        }
        if (counterAscending == 0) {
            return result = true;
        } else if (counterDescending == 0) {
            return result = true;
        } else return result = false;
    }
}