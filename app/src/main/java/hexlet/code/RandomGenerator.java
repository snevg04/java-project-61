package hexlet.code;

import java.util.Random;

public final class RandomGenerator {
    public static final Random RANDOM = new Random();
    private static final int DEFAULT_DIFFICULTY = 100;
    private static final int DEFAULT_PROGRESSION_LENGTH = 10;
    private static final int DEFAULT_STEP = DEFAULT_PROGRESSION_LENGTH - 1;

    public static int generateNumber() {
        return RANDOM.nextInt(DEFAULT_DIFFICULTY);
    }

    public static int generateOperation(int operationsCount) {
        return RANDOM.nextInt(operationsCount - 1);
    }

    public static int[] generateProgression() {

        int[] progressionArray = new int[DEFAULT_PROGRESSION_LENGTH];
        var seed = generateNumber();
        var step = RANDOM.nextInt(DEFAULT_STEP);
        for (var i = 0; i < progressionArray.length; i++) {
            var currentElement = seed + i * (step + 1);
            progressionArray[i] = currentElement;
        }

        return progressionArray;
    }

    public static int generateMissingElement() {
        return RANDOM.nextInt(DEFAULT_PROGRESSION_LENGTH);
    }

}
