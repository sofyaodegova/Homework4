package Arrays.task10;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        System.out.println("Is array sorted by descending? " + isSorted());
    }

    public static boolean isSorted() {

        Integer[] array = {5, 56, 8, 23, 78, 63, 6, 42, 2, 13};

        Arrays.sort(array, Collections.reverseOrder());
      /*  for (int values : array) {
            System.out.print(values + " "); // - можно включить, если нужно вывести уже отсортированный массив
        }*/

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                return false;
        }
        return true;
    }
}