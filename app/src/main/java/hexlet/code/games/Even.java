package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Even {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int question = RANDOM.nextInt();
            String questionString = Integer.toString(question);
            String answer = question % 2 == 0 ? "yes" : "no";
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;

            rounds[i][firstColumn] = questionString;
            rounds[i][secondColumn] = answer;
        }

        return rounds;
    }

}
