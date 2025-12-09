package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public final class GCD implements BrainGamesAPI {
    private int firstNumber;
    private int secondNumber;

    public void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public void getQuestion() {
        firstNumber = RandomGenerator.generateNumber();
        secondNumber = RandomGenerator.generateNumber();

        System.out.println("Question: " + firstNumber + " " + secondNumber);
    }

    public String getCorrectAnswer() {

        if (secondNumber != 0) {
            var a = firstNumber;
            var b = secondNumber;

            while (b != 0) {
                var remainder = a % b;
                a = b;
                b = remainder;
            }

            return Integer.toString(a);
        } else {
            return Integer.toString(secondNumber);
        }
    }

}
