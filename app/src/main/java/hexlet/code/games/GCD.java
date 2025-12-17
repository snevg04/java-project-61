package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class GCD {
    private static final int DEFAULT_ROUNDS_NUMBER = 3;
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_MIN_BOUND = 1;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 100;
    private static final String rules = "Find the greatest common divisor of given numbers.";
    public static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[DEFAULT_ROUNDS_NUMBER][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var row = 0; row < rounds.length; row++) {
            String question;
            String answer;
            var firstCol = 0;
            var secondCol = firstCol + 1;
            int firstNumber = RANDOM.nextInt(DEFAULT_RANDOM_MIN_BOUND, DEFAULT_RANDOM_MIN_BOUND);
            int secondNumber = RANDOM.nextInt(DEFAULT_RANDOM_MIN_BOUND, DEFAULT_RANDOM_MAX_BOUND);

            question = firstNumber + " " + secondNumber;

            var a = firstNumber;
            var b = secondNumber;

            while (b != 0) {
                var remainder = a % b;
                a = b;
                b = remainder;
            }

            answer = Integer.toString(a);

            rounds[row][firstCol] = question;
            rounds[row][secondCol] = answer;
        }

        return rounds;
    }

}
