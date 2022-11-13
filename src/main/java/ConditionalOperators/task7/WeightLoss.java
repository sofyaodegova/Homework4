package ConditionalOperators.task7;

public class WeightLoss {
    public static void main(String[] args) {
        int limit = 1400; // - Дневной лимит калорий
        int currentCalories = 1089; // - Потребленные калории на данный момент
        int chocolate = 340; // - Калорийность шоколада
        int porridge = 250; // - Калорийность каши
        int fat = 500; // - Калорийность сала

        int caloriesLeft = limit - currentCalories;
        System.out.println("У программиста осталось " + caloriesLeft + " калорий на день.");
        System.out.println("Что можно съесть?");

        if (caloriesLeft >= fat) {
            System.out.println("Программист может съесть сало, шоколадку или кашу");
        } else if (caloriesLeft >= chocolate) {
            System.out.println("Программист может съесть шоколадку или кашу");
        } else if (caloriesLeft >= porridge) {
            System.out.println("Программист может съесть только кашу");
        } else System.out.println("Лимит калорий на сегодня исчерпан");
    }
}