package hexlet.code;

public class Util {
    public static int getRandomNumber() {
        int maxNumber = 100;
        int randomNumber = (int) Math.floor(Math.random() * maxNumber);
        if (randomNumber == 0) {
            randomNumber += 1;
        }
        return randomNumber;
    }

    public static int getNumberOfRounds() {
        int numberOfRounds = 3;
        return numberOfRounds;
    }
}
