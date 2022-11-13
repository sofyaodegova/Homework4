package ConditionalOperators.task2;

public class TimeOfTheDay {
    public static void main(String[] args) {
        int time = 5;

        if (time <= 6) {
            System.out.println("Сейчас ночь");
        } else if (time <= 12) {
            System.out.println("Сейчас утро");
        } else if (time <= 18) {
            System.out.println("Сейчас день");
        } else if (time <= 24) {
            System.out.println("Сейчас вечер");
        } else {
            System.out.println("Неправильно задан формат времени");
        }
    }
}