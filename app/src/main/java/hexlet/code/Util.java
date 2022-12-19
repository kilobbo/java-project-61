package hexlet.code;

public class Util {
    public static int getRandomNumber() {
        int maxNumber = 100;
        int minNumber = 2;
        int randomNumber = (int) Math.floor(Math.random() * maxNumber);
        if (randomNumber == 0) {
            randomNumber += minNumber;
        }
        return randomNumber;
    }

    public static int getNumberOfRounds() {
        int numberOfRounds = 3;
        return numberOfRounds;
    }
}
