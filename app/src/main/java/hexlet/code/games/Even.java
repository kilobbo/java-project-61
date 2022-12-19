package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void runEven() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswers = Even.generateRound();

        Engine.game(questionsAndAnswers, description);
    }

    private static String[][] generateRound() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < Util.getNumberOfRounds(); i++) {
            int number = Util.getRandomNumber();
            String question = Integer.toString(number);
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
        if (Even.isEven(number)) {
            return "yes";
        }
        return "no";
    }
}
