package ConditionalOperators.task6;

public class AttractionControl {
    public static void main(String[] args) {

        int height = 130;
        boolean parents = true;

        if (height >= 160 || parents == true) {
            System.out.println("Вход разрешен");
        } else if (height < 160 || parents == false) {
            System.out.println("Вход запрещен");
        }
    }
}