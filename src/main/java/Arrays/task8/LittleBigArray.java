package Arrays.task8;

public class LittleBigArray {
    public static void main(String[] args) {

        int[] array = {5, 56, 8, 23, 78, 63, 6, 42, 2, 13};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if (sum >= 100) {
            System.out.println("Большой массив");
        }
        if (sum < 100) {
            System.out.println("Маленький массив");
        }
    }
}
