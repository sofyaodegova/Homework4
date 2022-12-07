package Arrays.task7;

import java.util.concurrent.ThreadLocalRandom;

public class ElementsSum {

    public static void main(String[] args) {
        System.out.println("Сумма равна: " + randomArray(10, 0, 0));
    }

    public static int randomArray(int arrayLength, int count, int sum) {

        int[] array = new int[arrayLength];
        int number = ThreadLocalRandom.current().nextInt(101);

        if (count >= arrayLength) {
            return sum;
        }

        sum += number;
        array[count] = number;
        System.out.println(array[count]);
        return randomArray(arrayLength, ++count, sum);
    }
}