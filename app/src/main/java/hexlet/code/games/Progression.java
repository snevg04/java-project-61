package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Progression {
    public static final Random RANDOM = new Random();
    public static String rules = "What number is missing in the progression?";

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[3][2];

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
        int progressionLength = 10;
        int[] progression = new int[progressionLength];
        var seed = RANDOM.nextInt(100);
        var step = RANDOM.nextInt(1, 10);

        for (var i = 0; i < progressionLength; i++) {
            var currentElement = seed + i * (step);
            progression[i] = currentElement;
        }

        return progression;
    }

}
