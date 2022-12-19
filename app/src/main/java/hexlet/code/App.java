package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String menu = "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ";
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        App.choice(choice);

        scanner.close();
    }

    private static void choice(String choice) {
        switch (choice) {
            case "1":
                Cli.player();
                break;
            case "2":
                Even.runEven();
                break;
            case "3":
                Calc.runCalc();
                break;
            case "4":
                GCD.runGCD();
                break;
            case "5":
                Progression.runProgression();
                break;
            case "6":
                Prime.runPrime();
                break;
            case "0":
                break;
            default:
                System.out.println("No such option.");
                break;
        }
    }
}
