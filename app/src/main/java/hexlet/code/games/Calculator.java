package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public final class Calculator implements BrainGamesAPI {
    private int question;
    private String questionString;
    private static final int DEFAULT_OPERATIONS_NUMBER = 3;

    public void getRules() {
        System.out.println("What is the result of the expression?");
    }

    public void getQuestion() {
        var firstNumber = RandomGenerator.generateNumber();
        var secondNumber = RandomGenerator.generateNumber();

        var operationNumber = RandomGenerator.generateOperation(DEFAULT_OPERATIONS_NUMBER);

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

        System.out.println("Question: " + questionString);
    }

    public String getCorrectAnswer() {
        return Integer.toString(question);
    }

}
