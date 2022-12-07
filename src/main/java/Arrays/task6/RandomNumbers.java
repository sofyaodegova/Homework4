package Arrays.task6;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        int n = 10;
        int i;
        int[] array = new int[n];

        for (i = 0; i <= array.length - 1; i++) {
            int number = ThreadLocalRandom.current().nextInt(101);
            array[i] = number;
            System.out.println(array[i]);
        }
    }
}