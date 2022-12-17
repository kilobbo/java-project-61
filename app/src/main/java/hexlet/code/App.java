package hexlet.code;

public class App {
    public static void main(String[] args) {
        String menu = "Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n" +
                "Your choice: ";
        System.out.println(menu);

        Engine.engine();
    }
}