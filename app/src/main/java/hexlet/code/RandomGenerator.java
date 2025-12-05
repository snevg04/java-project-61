package hexlet.code;

import java.util.Random;

public class RandomGenerator {
    public static Random random = new Random();

    public static int generateNumber(int number) {
        return random.nextInt(number);
    }

}
