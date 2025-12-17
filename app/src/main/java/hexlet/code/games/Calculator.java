package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Calculator {
    private static final int DEFAULT_ROUNDS_NUMBER = 3;
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_OPERATIONS_NUMBER = 3;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 100;
    private static final String rules = "What is the result of the expression?";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[DEFAULT_ROUNDS_NUMBER][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var row = 0; row < rounds.length; row++) {
            int firstNumber = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int secondNumber = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int operationNumber = RANDOM.nextInt(DEFAULT_OPERATIONS_NUMBER);
            int question;
            String questionString;
            String answer;
            var firstCol = 0;
            var secondCol = firstCol + 1;

            switch (operationNumber) {
                case 0:
                    question = firstNumber + secondNumber;
                    questionString = firstNumber + " + " + secondNumber;
                    break;
                case 1:
                    question = firstNumber - secondNumber;
                    questionString = firstNumber + " - " + secondNumber;
                    break;
                default:
                    question = firstNumber * secondNumber;
                    questionString = firstNumber + " * " + secondNumber;
                    break;
            }

            answer = Integer.toString(question);
            rounds[row][firstCol] = questionString;
            rounds[row][secondCol] = answer;
        }

        return rounds;
    }

}

