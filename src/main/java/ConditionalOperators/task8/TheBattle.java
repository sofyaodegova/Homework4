package ConditionalOperators.task8;

public class TheBattle {
    public static void main(String[] args) {
        int sithPallatin = 100;
        int jediObiVan = 120;
        int sithDartMol = 100;
        int sith = 80;
        int jedi = 100;

        if (sith > jedi) {
            System.out.println("Джедай победит");
        } else if (sith < jedi) {
            System.out.println("Джедай победит");
        } else if (sith == jedi) {
            System.out.println("Ситх победит");
        }
    }
    // Известно, что если ситх стоит выше джедая, ситх проиграет. Если джедай стоит выше
    //ситха, джедай выигрывает. Если ситх и джедай на одной высоте, победа остаётся за
    //ситхом.
    //Но из этого правила есть исключения. Ситх Палпатин выигрывает всегда. Джедай Оби
    //Ван выигрырывает у ситха Дарта Мола даже если они стоят на одной и той же высоте.

}
