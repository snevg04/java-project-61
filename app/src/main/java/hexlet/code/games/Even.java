package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public class Even implements BrainGamesAPI {
    public int question;

    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public void getQuestion() {
        question = RandomGenerator.generateNumber(1000);
        System.out.println(question);
        getCorrectAnswer();
    }

    public String getCorrectAnswer() {
        return question % 2 == 0 ? "yes" : "no";
    }

}
