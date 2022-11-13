package ConditionalOperators.task5;

public class JobOffer {
    public static void main(String[] args) {

        int month = 30; // days

        int time1 = 44; // min - one way
        int compensation1 = 30000; // rub/month
        int timePerMonth1 = time1 * 2 * month;
        System.out.println(timePerMonth1 + " минут ты будешь тратить в месяц на поездки на работу и обратно, если выберешь первый" +
                " оффер.");

        int a = compensation1 / timePerMonth1;

        int time2 = 52; // min - one way
        int compensation2 = 32000; // rub/month
        int timePerMonth2 = time2 * 2 * month;
        System.out.println(timePerMonth2 + " минут ты будешь тратить в месяц на поездки на работу и обратно, если выберешь второй" +
                " оффер.");

        int b = compensation2 / timePerMonth2;

        if (a > b) {
            System.out.println("Выгоднее выбрать первый оффер");
        } else if (a < b) {
            System.out.println("Выгоднее выбрать второй оффер");
        } else {
            System.out.println("Без разницы, куда устраиваться и вообще, найди работу получше");
        }
    }
}