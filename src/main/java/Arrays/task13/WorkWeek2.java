package Arrays.task13;

import java.util.Arrays;

public class WorkWeek2 {
    public static void main(String[] args) {
        int[] workHours = {8, 6, 8, 9, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0, 6, 10, 8, 8};

        int count;
        if (workHours.length % 7 == 0) {
            count = workHours.length / 7;
        } else {
            count = (workHours.length / 7) + 1;
        }

        int[] hoursOfWeek = new int[count];


        for (int i = 0; i < workHours.length; i++) {
            hoursOfWeek[i / 7] += workHours[i];
        }
        System.out.println("Сотрудник работал часов за недели: " + Arrays.toString(hoursOfWeek));
    }
}