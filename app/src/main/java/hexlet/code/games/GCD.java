package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class GCD {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_MIN_BOUND = 1;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 101;
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;
            int firstNumber = random.nextInt(DEFAULT_RANDOM_MIN_BOUND, DEFAULT_RANDOM_MAX_BOUND);
            int secondNumber = random.nextInt(DEFAULT_RANDOM_MIN_BOUND, DEFAULT_RANDOM_MAX_BOUND);

            String question = firstNumber + " " + secondNumber;
            String answer = Integer.toString(calculateGCD(firstNumber, secondNumber));

            rounds[i][firstColumn] = question;
            rounds[i][secondColumn] = answer;
        }

        return rounds;
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            var remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

}
