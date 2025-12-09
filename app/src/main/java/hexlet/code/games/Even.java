package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public final class Even implements BrainGamesAPI {
    private int question;

    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public void getQuestion() {
        question = RandomGenerator.generateNumber();
        System.out.println("Question: " + question);
        getCorrectAnswer();
    }

    public String getCorrectAnswer() {
        return question % 2 == 0 ? "yes" : "no";
    }

}
