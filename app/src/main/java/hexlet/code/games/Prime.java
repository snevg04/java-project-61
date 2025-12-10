package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public final class Prime implements BrainGamesAPI {
    private boolean answer;
    private int question;

    public void getRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public void getQuestion() {
        question = RandomGenerator.generateNumber();

        System.out.println("Question: " + question);
    }

    public boolean isPrime() {

        if (question == 2) {
            return true;
        }

        if (question < 2 || question % 2 == 0) {
            return false;
        }


        var firstOddDivisor = 3;
        var currentNumberSquareRoot = Math.sqrt(question);

        for (var i = firstOddDivisor; i <= currentNumberSquareRoot; i += 2) {
            if (question % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String getCorrectAnswer() {
        answer = isPrime();

        if (answer) {
            return "yes";
        }
        return "no";
    }
}
