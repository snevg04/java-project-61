package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Prime {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_BOUND = 101;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstColumn = 0;
            int secondColumn = firstColumn + 1;
            int question = random.nextInt(DEFAULT_RANDOM_BOUND);

            String questionString = Integer.toString(question);
            String answer = isPrime(question) ? "yes" : "no";

            rounds[i][firstColumn] = questionString;
            rounds[i][secondColumn] = answer;

        }

        return rounds;
    }

    public static boolean isPrime(int question) {
        final int firstOddDivisor = 3;
        if (question == 2) {
            return true;
        }

        if (question < 2 || question % 2 == 0) {
            return false;
        }

        var currentNumberSquareRoot = Math.sqrt(question);

        for (var i = firstOddDivisor; i <= currentNumberSquareRoot; i += 2) {
            if (question % i == 0) {
                return false;
            }
        }

        return true;
    }
}
