package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void game(String[][] questionsAndAnswers, String description) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

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

