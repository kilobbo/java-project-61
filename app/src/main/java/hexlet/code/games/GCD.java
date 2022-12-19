package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void runGCD() {
        String description = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = GCD.generateRound();

        Engine.game(questionsAndAnswers, description);
    }

    private static String[][] generateRound() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < 3; i++) {
            String[] numbers = GCD.greatestCommonDivisor();
            questionsAndAnswers[0][i] = numbers[0];

            String answer = numbers[1];
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static String[] greatestCommonDivisor() {
        int firstNumber = GCD.getRandomNumber();
        int secondNumber = GCD.getRandomNumber();
        int possibleDivisor = GCD.lessNumber(firstNumber, secondNumber);
        while (possibleDivisor > 0) {
            if (firstNumber % possibleDivisor == 0 && secondNumber % possibleDivisor == 0) {
                break;
            } else {
                possibleDivisor -= 1;
            }
        }
        int gcd = possibleDivisor;

        return new String[]{firstNumber + " " + secondNumber, Integer.toString(gcd)};
    }

    private static int lessNumber(int firstNumber, int secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }

    private static int getRandomNumber() {
        return (int) Math.floor(Math.random() * 100);
    }
}
