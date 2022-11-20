package Arrays.task14;

import java.util.Arrays;

public class Overtime {
    public static void main(String[] args) {
        int[] workWeek = {8, 10, 9, 10, 8, 12, 14, 9};
        int[] overtime = new int[workWeek.length];
        int sum = 0;
        int j = 0;

        for (int i = 0; i < workWeek.length; i++) {
            overtime[i] = workWeek[i] - 8;
            j++;
            if (j > 5) {
                overtime[i] = workWeek[i];
                j++;
            }
            if (j > 7) {
                j = 0;
            }
            sum += overtime[i];
        }
        System.out.println("Переработки Пети каждый день: " + Arrays.toString(overtime));
        System.out.println("Сумма часов переработки: " + sum);
    }
}