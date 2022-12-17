package hexlet.code.games;

import hexlet.code.Engine;

import java.lang.*;

public class Calc {
    public static void gameCalc() {
        System.out.println("What is the result of the expression?");

        String[][] questionsAndAnswers = Calc.algorithm();

        Engine.game(questionsAndAnswers);
    }

    private static String[][] algorithm() {
        String[][] questionsAndAnswers = new String[3][3];

        for (var i = 0; i < 3; i++) {
            String[] expression = Calc.generateExpression();
            questionsAndAnswers[0][i] = expression[0];

            String answer = expression[1];
            questionsAndAnswers[1][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static String[] generateExpression() {
        int firstNumber = Calc.getRandomNumber();
        int secondNumber = Calc.getRandomNumber();
        char operator = getRandomOperator();
        return new String[]{firstNumber + " " + operator + " " + secondNumber,
                String.valueOf(calculate(firstNumber, secondNumber, operator))};
    }

    private static int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        }
        return result;
    }

    private static int getRandomNumber() {
        return (int) Math.floor(Math.random()*100);
    }

    private static char getRandomOperator() {
        char[] operatorsArray = new char[]{'+', '*', '-'};
        int randomNumber = (int) Math.floor(Math.random() * operatorsArray.length);
        return operatorsArray[randomNumber];
    }
}