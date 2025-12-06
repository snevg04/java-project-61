package hexlet.code;

import java.util.Random;

public class RandomGenerator {
    public static Random random = new Random();

    public static int generateNumber(int difficulty) {
        return random.nextInt(difficulty);
    }

    public static int[] generateProgression(int difficulty) {
        var itemsCount = 10;
        int[] progressionArray = new int[itemsCount];
        var seed = generateNumber(difficulty);
        var step = generateNumber(9);
        for (var i = 0; i < progressionArray.length; i++) {
            var currentElement = seed + i * (step + 1);
            progressionArray[i] = currentElement;
        }

        return progressionArray;

    }

}
