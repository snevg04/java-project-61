package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Progression {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_MIN_STEP_BOUND = 1;
    private static final int DEFAULT_RANDOM_MAX_STEP_BOUND = 11;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 101;
    private static final int DEFAULT_PROGRESSION_LENGTH = 10;
    private static final String RULES = "What number is missing in the progression?";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;
            int initialNumber = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int step = RANDOM.nextInt(DEFAULT_RANDOM_MIN_STEP_BOUND, DEFAULT_RANDOM_MAX_STEP_BOUND);
            int[] progression = generateProgression(initialNumber, step, DEFAULT_PROGRESSION_LENGTH);
            int missingItem = RANDOM.nextInt(progression.length);
            String question;
            String answer;

            String[] progressionString = new String[progression.length];

            for (int j = 0; j < progression.length; j++) {
                progressionString[j] = String.valueOf(progression[j]);
            }

            answer = progressionString[missingItem];
            progressionString[missingItem] = "..";
            question = String.join(" ", progressionString);

            rounds[i][firstColumn] = question;
            rounds[i][secondColumn] = answer;

        }

        return rounds;
    }

    public static int[] generateProgression(int initialNumber, int step, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            var currentElement = initialNumber + i * (step);
            progression[i] = currentElement;
        }

        return progression;
    }

}
