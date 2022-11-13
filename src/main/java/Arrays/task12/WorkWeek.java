package Arrays.task12;

import java.util.Arrays;

public class WorkWeek {
    public static void main(String[] args) {

        int[] workHours = {8, 6, 8, 9, 6, 0, 0, 6, 10, 8, 8, 6, 0, 0};
        int count = workHours.length / 7;
        int[] hoursOfWeek = new int[count];
        int sum = 0;

        for (int n = 0; n < count; n++) {
            for (int i = 0; i < 7; i++) {
                sum += workHours[i] - hoursOfWeek[n];
            }
            hoursOfWeek[n] = sum;
        }
        System.out.println("Работник работал за " + count + " недели " + Arrays.toString(hoursOfWeek) + " часов " +
                "соответственно.");
    }
}