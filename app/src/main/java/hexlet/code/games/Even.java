package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    public static final Random RANDOM = new Random();
    public static String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[3][2];

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
