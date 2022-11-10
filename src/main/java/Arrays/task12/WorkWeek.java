package Arrays.task12;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkWeek {
    public static void main(String[] args) {
        int[] workHours = {8, 6, 8, 9, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0};

        int week1 = 0;
        int week2 = 0;

        for (int i = 0; i < workHours.length - 7; i++) {
            week1 = week1 + workHours[i];
        }
        for (int i = 7; i < workHours.length; i++) {
            week2 = week2 + workHours[i];
        }

        int[] weekHours = new int[2];
        weekHours[0] = week1;
        weekHours[1] = week2;
        System.out.println(Arrays.toString(weekHours));
    }
}