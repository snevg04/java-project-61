package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Prime {
    private static final int FIRST_ODD_DIVISOR = 3;
    private static final int DEFAULT_ROUNDS_NUMBER = 3;
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_BOUND = 100;
    private static final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[DEFAULT_ROUNDS_NUMBER][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var row = 0; row < rounds.length; row++) {
            String questionString;
            String answer;
            int firstCol = 0;
            int secondCol = firstCol + 1;

            int question = RANDOM.nextInt(DEFAULT_RANDOM_BOUND);
            questionString = Integer.toString(question);
            answer = isPrime(question) ? "yes" : "no";

            rounds[row][firstCol] = questionString;
            rounds[row][secondCol] = answer;

        }

        return rounds;
    }

    public static boolean isPrime(int question) {

        if (question == 2) {
            return true;
        }

        if (question < 2 || question % 2 == 0) {
            return false;
        }

        var currentNumberSquareRoot = Math.sqrt(question);

        for (var i = FIRST_ODD_DIVISOR; i <= currentNumberSquareRoot; i += 2) {
            if (question % i == 0) {
                return false;
            }
        }

        return true;
    }
}
