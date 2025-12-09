package hexlet.code;

import java.util.Random;

public final class RandomGenerator {
    public static Random random = new Random();
    private static final int DEFAULT_DIFFICULTY = 100;
    private static final int DEFAULT_PROGRESSION_LENGTH = 10;

    public static int generateNumber() {
        return random.nextInt(DEFAULT_DIFFICULTY);
    }

    public static int generateOperation(int operationsCount) {
        return random.nextInt(operationsCount - 1);
    }

    public static int[] generateProgression() {
        var itemsCount = 10;
        int[] progressionArray = new int[itemsCount];
        var seed = generateNumber();
        var step = random.nextInt(9);
        for (var i = 0; i < progressionArray.length; i++) {
            var currentElement = seed + i * (step + 1);
            progressionArray[i] = currentElement;
        }

        return progressionArray;
    }

    public static int generateMissingElement() {
        return random.nextInt(DEFAULT_PROGRESSION_LENGTH);
    }

}
