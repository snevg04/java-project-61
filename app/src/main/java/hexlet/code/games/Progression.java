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

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;
            int first = random.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int step = random.nextInt(DEFAULT_RANDOM_MIN_STEP_BOUND, DEFAULT_RANDOM_MAX_STEP_BOUND);
            String[] progression = makeProgression(first, step, DEFAULT_PROGRESSION_LENGTH);
            int hiddenIndex = random.nextInt(progression.length);

            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            rounds[i][firstColumn] = question;
            rounds[i][secondColumn] = answer;

        }

        return rounds;
    }

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            var currentElement = first + i * (step);
            progression[i] = Integer.toString(currentElement);
        }

        return progression;
    }

}
