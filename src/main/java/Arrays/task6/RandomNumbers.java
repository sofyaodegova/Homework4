package Arrays.task6;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println(randomArray(10, 0));
    }

    public static int randomArray(int n, int i) {

        int[] array = new int[n];
        int number = ThreadLocalRandom.current().nextInt(101);

        if (i >= n - 1) {
            return array[i] = number;
        }

        if (i <= n - 1) {
            array[i] = number;
            System.out.println(array[i]);
        }
        return randomArray(n, ++i);
    }
}