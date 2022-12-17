package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gameGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");

        String[][] questionsAndAnswers = GCD.algorithm();

        Engine.game(questionsAndAnswers);
    }

    private static String[][] algorithm() {
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
        int lessNumber = GCD.lessNumber(firstNumber, secondNumber);
        while (lessNumber > 0) {
            if (firstNumber % lessNumber == 0 && secondNumber % lessNumber == 0) {
                break;
            } else {
                lessNumber -= 1;
            }
        }
        int GCD = lessNumber;

        return new String[]{firstNumber + " " + secondNumber, Integer.toString(GCD)};
    }

    private static int lessNumber (int firstNumber, int secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }

    private static int getRandomNumber() {
        return (int) Math.floor(Math.random()*100);
    }
}