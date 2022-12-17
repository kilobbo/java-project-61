package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void gamePrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[][] questionsAndAnswers = Prime.algorithm();

        Engine.game(questionsAndAnswers);
    }

    private static String[][] algorithm() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < 3; i++) {
            int number = (int) Math.floor(Math.random()*100);
            var question = Integer.toString(number);
            questionsAndAnswers[0][i] = question;

            String answer = Prime.rightAnswer(number);
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static boolean isPrime (int number) {
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