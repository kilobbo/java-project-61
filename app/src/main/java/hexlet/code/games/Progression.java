package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    public static void gameProgression() {
        System.out.println("What number is missing in the progression?");

        String[][] questionsAndAnswers = Progression.algorithm();

        Engine.game(questionsAndAnswers);
    }

    private static String[][] algorithm() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < 3; i++) {
            String[] numbers = Progression.getAnswerAndHideHim();
            questionsAndAnswers[0][i] = numbers[0];

            String answer = numbers[1];
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static String[] makeProgression() {
        int firstNumber = Progression.getRandomNumber();
        int increase = Progression.getRandomNumber();

        String[] progression = new String[10];
        progression[0] = Integer.toString(firstNumber);

        for (var i = 1; i < progression.length; i++) {
            progression[i] = Integer.toString(firstNumber + increase * i);
        }

        return progression;
    }

    private static String[] getAnswerAndHideHim () {
        var randomNumber = (int) Math.floor(Math.random() * 10);

        var progression = Progression.makeProgression();
        var theAnswer = progression[randomNumber];

        for (var i = 0; i < progression.length; i++) {
            if (theAnswer.equals(progression[i])) {
                progression[i] = "..";
                break;
            }
        }

        var stringProgression = Arrays.toString(progression);
        stringProgression = stringProgression.substring(1, stringProgression.length() - 1);

        return new String[]{stringProgression, theAnswer};
    }

    private static int getRandomNumber() {
        return (int) Math.floor(Math.random()*100);
    }
}