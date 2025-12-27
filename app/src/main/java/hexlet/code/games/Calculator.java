package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Calculator {
    private static final int DEFAULT_ROUNDS_INFO_ITEMS = 2;
    private static final int DEFAULT_RANDOM_MAX_BOUND = 101;
    private static final String RULES = "What is the result of the expression?";

    public static void run() {
        Engine.run(RULES, generateRounds());
    }

    public static int generateNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[Engine.ROUNDS][DEFAULT_ROUNDS_INFO_ITEMS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int number1 = generateNumber(0, DEFAULT_RANDOM_MAX_BOUND);
            int number2 = generateNumber(0, DEFAULT_RANDOM_MAX_BOUND);
            var firstColumn = 0;
            var secondColumn = firstColumn + 1;
            final char[] operators = {'+', '-', '*'};

            var indexOperator = generateNumber(0, operators.length);
            var operator = operators[indexOperator];

            String question = number1 + " " + operator + " " + number2;
            String answer = Integer.toString(calculate(number1, number2, operator));

            rounds[i][firstColumn] = question;
            rounds[i][secondColumn] = answer;
        }

        return rounds;
    }

    public static int calculate(int firstNumber, int secondNumber, char operation) {
        int result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown operation: " + operation + "!");
        }

        return result;
    }

}
