package ConditionalOperators.task1;

public class IdealWeight {
    public static void main(String[] args) {

        int height = 180;


        double idealWeight = (height - 100) - 0.1;
        System.out.println("Идеальный вес: " + idealWeight + " +- 5 кг.");
        double min = idealWeight - 5.0;
        double max = idealWeight + 5.0;

        double weight = 82.55;

        if (weight < min) {
            System.out.println("Ваш вес не идеален");
        } else if (weight > max) {
            System.out.println("Ваш вес не идеален");
        } else {
            System.out.println("Ваш вес идеален");
        }
    }
}