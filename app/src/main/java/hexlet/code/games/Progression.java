package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Progression {
    private static final int DEFAULT_ROUNDS_NUMBER = 3;
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_MIN_STEP_BOUND = 1;
    private static final int DEFAULT_RANDOM_MAX_STEP_BOUND = 10;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 101;
    private static final int DEFAULT_PROGRESSION_LENGTH = 10;
    private static final String RULES = "What number is missing in the progression?";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[DEFAULT_ROUNDS_NUMBER][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var row = 0; row < rounds.length; row++) {
            var firstCol = 0;
            var secondCol = firstCol + 1;
            int[] progression = generateProgression();
            int missingItem = RANDOM.nextInt(progression.length);
            String question;
            String answer;

            String[] progressionString = new String[progression.length];

            for (int i = 0; i < progression.length; i++) {
                progressionString[i] = String.valueOf(progression[i]);
            }

            answer = progressionString[missingItem];
            progressionString[missingItem] = "..";
            question = String.join(" ", progressionString);

            rounds[row][firstCol] = question;
            rounds[row][secondCol] = answer;

        }

        return rounds;
    }

    public static int[] generateProgression() {
        int[] progression = new int[DEFAULT_PROGRESSION_LENGTH];
        var seed = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
        var step = RANDOM.nextInt(DEFAULT_RANDOM_MIN_STEP_BOUND, DEFAULT_RANDOM_MAX_STEP_BOUND);

        for (var i = 0; i < DEFAULT_PROGRESSION_LENGTH; i++) {
            var currentElement = seed + i * (step);
            progression[i] = currentElement;
        }

        return progression;
    }

}
