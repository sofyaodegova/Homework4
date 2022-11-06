package Arrays.task4;

public class ArrayListDefault {

    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент массива №" + i + " - " + array[i]);
        }
    }
}