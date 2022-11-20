package Arrays.task15;

public class ArrayAnomalies {
    public static void main(String[] args) {
        int[] anomalies = {100, 90, 120, 150, 22, 5};

        for (int i = 0; i < anomalies.length - 1; i++) {
            System.out.println(anomalies[i]);
            if (anomalies[i] <= anomalies[i + 1]) {
                System.out.println(anomalies[i + 1] + "<---- аномальный элемент");
            }
        }
    }
}


