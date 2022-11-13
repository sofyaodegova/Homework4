package ConditionalOperators.task6;

public class AttractionControl {
    public static void main(String[] args) {

        int height = 144;
        boolean parents = false;

        if (height >= 160) {
            System.out.println("Вход разрешен");
        } else if (parents == true) {
            System.out.println("Вход разрешен");
        } else if (parents == false) {
            System.out.println("Вход запрещен");
        }
    }
}