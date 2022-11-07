package Arrays.task7;

import java.util.concurrent.ThreadLocalRandom;

public class ElementsSum {

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + randomArray(10, 0, 0));
    }

    public static int randomArray(int n, int i, int sum) {

        int[] array = new int[n];
        int number = ThreadLocalRandom.current().nextInt(101);

        if (i >= n) {
            return sum;
        }

        sum += number;
        array[i] = number;
        System.out.println(array[i]);
        return randomArray(n, ++i, sum);
    }
}