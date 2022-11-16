package Arrays.task13;

import java.util.Arrays;

public class WorkWeek2 {
    public static void main(String[] args) {
        int[] workHours = {8, 6, 8, 9, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0, 6, 10, 8, 8};
        int count = workHours.length / 7;
        int[] hoursOfWeek = new int[count + 1];

        for (int i = 0; i < workHours.length; i++) {
            hoursOfWeek[i / 7] += workHours[i];
        }
        System.out.println("Сотрудник работал часов за недели: " + Arrays.toString(hoursOfWeek));
    }
}