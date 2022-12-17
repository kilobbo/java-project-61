// проверь матх.рандом !!!

package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[][] questionsAndAnswers = Even.algorithm();

        Engine.game(questionsAndAnswers);
    }

    private static String[][] algorithm() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < 3; i++) {
            int number = (int) Math.floor(Math.random()*100);
            var question = Integer.toString(number);
            questionsAndAnswers[0][i] = question;

            String answer = Even.rightAnswer(number);
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String rightAnswer(int number) {
        if (Even.isEven(number) == true) {
            return "yes";
        }
        return "no";
    }
}
