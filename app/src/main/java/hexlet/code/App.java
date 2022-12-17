package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String menu = "Please enter the game number and press Enter.\n" +
                "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n" +
                "Your choice: ";
        System.out.println(menu);

        Engine.engine();
    }
}