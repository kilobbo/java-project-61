package hexlet.code;

public class Util {
    public static int getRandomNumber() {
        final int MAXNUMBER = 100;
        final int MINNUMBER = 2;
        int randomNumber = (int) Math.floor(Math.random() * MAXNUMBER);
        if (randomNumber == 0) {
            randomNumber += MINNUMBER;
        }
        return randomNumber;
    }

    public static int getNumberOfRounds() {
        final int NUMBEROFROUNDS = 3;
        return NUMBEROFROUNDS;
    }
}
