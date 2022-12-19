package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Arrays;

public class Progression {
    public static void runProgression() {
        String description = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < Util.getNumberOfRounds(); i++) {
            String[] round = Progression.getAnswerAndHideHim();
            questionsAndAnswers[0][i] = round[0];

            String answer = round[1];
            questionsAndAnswers[1][i] = answer;
        }

        Engine.game(questionsAndAnswers, description);
    }

    private static String[] generateProgression() {
        int firstNumber = Util.getRandomNumber();
        int increase = Util.getRandomNumber();
        final int DIGITSINLINE = 10;

        String[] progression = new String[DIGITSINLINE];
        progression[0] = Integer.toString(firstNumber);

        for (var i = 1; i < progression.length; i++) {
            progression[i] = Integer.toString(firstNumber + increase * i);
        }

        return progression;
    }

    private static String[] getAnswerAndHideHim() {
        final int numberOfDigitsInLine = 10;
        var randomNumber = (int) Math.floor(Math.random() * numberOfDigitsInLine);

        String[] progression = Progression.generateProgression();
        String theAnswer = progression[randomNumber];

        for (var i = 0; i < progression.length; i++) {
            if (theAnswer.equals(progression[i])) {
                progression[i] = "..";
                break;
            }
        }

        String stringProgression = Progression.removeCommasAndBracketsAndTurnToString(progression);

        return new String[]{stringProgression, theAnswer};
    }

    private static String removeCommasAndBracketsAndTurnToString(String[] progression) {
        String stringProgression = Arrays.toString(progression);
        stringProgression = stringProgression.substring(1, stringProgression.length() - 1).replace(",", "");
        return stringProgression;
    }
}
