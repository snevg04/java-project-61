package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static final int DEFAULT_ROUNDS_NUMBER = 3;
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[DEFAULT_ROUNDS_NUMBER][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var row = 0; row < rounds.length; row++) {
            int question = RANDOM.nextInt();
            String questionString = Integer.toString(question);
            String answer = question % 2 == 0 ? "yes" : "no";
            var firstCol = 0;
            var secondCol = firstCol + 1;

            rounds[row][firstCol] = questionString;
            rounds[row][secondCol] = answer;
        }

        return rounds;
    }

}
