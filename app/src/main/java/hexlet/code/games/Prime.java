package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void runPrime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = Prime.generateRound();

        Engine.game(questionsAndAnswers, description);
    }

    private static String[][] generateRound() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < Util.getNumberOfRounds(); i++) {
            int number = Util.getRandomNumber();
            String question = Integer.toString(number);
            questionsAndAnswers[0][i] = question;

            String answer = Prime.rightAnswer(number);
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String rightAnswer(int number) {
        if (Prime.isPrime(number)) {
            return "yes";
        }
        return "no";
    }
}
