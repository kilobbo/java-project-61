package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int[] numbers = {15, 6, 7};

        for (var i = 0; i < numbers.length; i++) {
            System.out.println("Question: " + numbers[i]);
            System.out.println("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(Even.rightAnswer(numbers[i]))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer ;(. Correct answer was '"
                        + Even.rightAnswer(numbers[i])
                        + "'.\n" +
                        "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

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
