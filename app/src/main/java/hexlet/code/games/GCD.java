package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class GCD {
    public static final Random RANDOM = new Random();
    public static String rules = "Find the greatest common divisor of given numbers.";

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[3][2];

        for (var row = 0; row < rounds.length; row++) {
            String question;
            String answer;
            var firstCol = 0;
            var secondCol = firstCol + 1;
            int firstNumber = RANDOM.nextInt(1, 100);
            int secondNumber = RANDOM.nextInt(1, 100);

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

