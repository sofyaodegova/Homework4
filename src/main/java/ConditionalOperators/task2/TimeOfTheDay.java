package ConditionalOperators.task2;

public class TimeOfTheDay {
    public static void main(String[] args) {
        double time = 23.55;

        if (time <= 6.00) {
            System.out.println("Сейчас ночь");
        } else if (time <= 12.00) {
            System.out.println("Сейчас утро");
        } else if (time <= 18.00) {
            System.out.println("Сейчас день");
        } else if (time <= 23.59) {
            System.out.println("Сейчас вечер");
        } else {
            System.out.println("Неправильно задан формат времени");
        }
    }
}