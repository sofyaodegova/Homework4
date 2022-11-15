package Arrays.task12;

import java.util.Arrays;

public class WorkWeek {
    public static void main(String[] args) {

        int[] workHours = {8, 6, 8, 9, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0};
        int count = workHours.length / 7;
        int[] hoursOfWeek = new int[count];

        for (int i = 0; i < workHours.length; i++) {
            hoursOfWeek[i / 7] += workHours[i];
        }
        System.out.println(Arrays.toString(hoursOfWeek));
    }
}