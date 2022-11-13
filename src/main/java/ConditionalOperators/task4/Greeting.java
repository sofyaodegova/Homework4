package ConditionalOperators.task4;

public class Greeting {
    public static void main(String[] args) {
        int time = 16;
        int day = 6;

        if (day <= 5) {
            if (time < 8) {
                System.out.println("Доброе утро");
            } else if (time < 11) {
                System.out.println("Всё пропало, ты проспал!");
            } else if (time >= 11) {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул!");
            }

        } else if (day > 5) {
            if (time < 12) {
                System.out.println("Доброе утро");
            } else if (time < 16) {
                System.out.println("Лучше поспать ещё");
            } else if (time < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else if (time >= 18) {
                System.out.println("Даа... С режимом что-то надо делать");
            }
        }
    }
}