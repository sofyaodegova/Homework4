package Arrays.task5;

public class ArrayListReverse {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = i;

            System.out.println(array[i]);
        }
    }
}