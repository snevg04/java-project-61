package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public class Even implements BrainGamesAPI {
    private int question;
    private int difficulty = 1000;

    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public void getQuestion() {
        question = RandomGenerator.generateNumber(difficulty);
        System.out.println(question);
        getCorrectAnswer();
    }

    public String getCorrectAnswer() {
        return question % 2 == 0 ? "yes" : "no";
    }

}
