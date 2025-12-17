package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Calculator {
    public static final Random RANDOM = new Random();
    public static String rules = "What is the result of the expression?";

    public static void run() {
        Engine.run(rules, generateRounds());
    }

    public static String[][] generateRounds() {
        String[][] rounds = new String[3][2];
        int operationsCount = 3;

        for (var row = 0; row < rounds.length; row++) {
            int firstNumber = RANDOM.nextInt(100);
            int secondNumber = RANDOM.nextInt(100);
            int operationNumber = RANDOM.nextInt(operationsCount);
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

