package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Calculator {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_OPERATIONS_NUMBER = 3;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 101;
    private static final String RULES = "What is the result of the expression?";
    private static final Random RANDOM = new Random();

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int secondNumber = RANDOM.nextInt(DEFAULT_RANDOM_MAX_BOUND);
            int operationNumber = RANDOM.nextInt(DEFAULT_OPERATIONS_NUMBER);
            String question;
            String answer;
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;

            question = getQuestion(firstNumber, secondNumber, operationNumber);
            answer = Integer.toString(calculate(firstNumber, secondNumber, operationNumber));

            rounds[i][firstColumn] = question;
            rounds[i][secondColumn] = answer;
        }

        return rounds;
    }

    public static String getQuestion(int firstNumber, int secondNumber, int operationNumber) {
        String result;

        switch (operationNumber) {
            case 0:
                result = firstNumber + " + " + secondNumber;
                break;
            case 1:
                result = firstNumber + " - " + secondNumber;
                break;
            default:
                result = firstNumber + " * " + secondNumber;
                break;
        }

        return result;
    }

    public static int calculate(int firstNumber, int secondNumber, int operationNumber) {
        int result;
        switch (operationNumber) {
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            default:
                result = firstNumber * secondNumber;
                break;
        }

        return result;
    }

}
