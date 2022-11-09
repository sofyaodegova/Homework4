package Arrays.task9;

import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        System.out.println("Is array sorted by ascending? " + isSorted());
    }

    public static boolean isSorted() {

        int[] array = {5, 56, 8, 23, 78, 63, 6, 42, 2, 13};

        Arrays.sort(array);
        /*for (int values : array) {
            System.out.print(values + " "); - можно включить, если нужно вывести уже отсортированный массив
        }*/

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}