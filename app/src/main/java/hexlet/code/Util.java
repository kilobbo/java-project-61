package hexlet.code;

public class Util {
    public static int getRandomNumber() {
        final int maxNumber = 100;
        final int minNumber = 2;
        int randomNumber = (int) Math.floor(Math.random() * maxNumber);
        if (randomNumber == 0) {
            randomNumber += minNumber;
        }
        return randomNumber;
    }

    public static int getNumberOfRounds() {
        final int numberOfPounds = 3;
        return numberOfPounds;
    }
}
