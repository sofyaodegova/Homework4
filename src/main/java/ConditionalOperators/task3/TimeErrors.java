package ConditionalOperators.task3;

public class TimeErrors {

    public static void main(String[] args) {
        int time = 96;

        if (time < 0) {
            System.out.println("Неправильно задан формат времени, введите корректное время");
        } else if (time <= 6) {
            System.out.println("Сейчас ночь");
        } else if (time <= 12) {
            System.out.println("Сейчас утро");
        } else if (time <= 18) {
            System.out.println("Сейчас день");
        } else if (time <= 24) {
            System.out.println("Сейчас вечер");
        } else {
            System.out.println("Неправильно задан формат времени. Вернитесь с другой планеты на Землю и введите время" +
                    " корректно");
        }
    }
}
