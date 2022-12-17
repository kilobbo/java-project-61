package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void engine() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        Engine.choice(choice);

        scanner.close();
    }

    private static void choice(String choice){
        switch (choice) {
            case "1":
                Cli.player();
                break;
            case "2":
                Even.gameEven();
                break;
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                GCD.gameGCD();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
            case "0":
                break;
            default:
                System.out.println("Please, enter number from 0 to 6.");
                Engine.engine();
        }
    }

    public static void game(String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        for (var i = 0; i < 3; i++) {
            System.out.println("Question: " + questionsAndAnswers[0][i]);
            System.out.println("Your answer: ");

            String userAnswer = scanner.next();

            if (userAnswer.equals(questionsAndAnswers[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[1][i]
                        + "'.\n" +
                        "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

