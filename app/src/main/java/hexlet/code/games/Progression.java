package hexlet.code.games;

import hexlet.code.BrainGamesAPI;
import hexlet.code.RandomGenerator;

public class Progression implements BrainGamesAPI {
    private int difficulty = 100;
    private String answer;

    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    public void getQuestion() {
        var currentProgression = RandomGenerator.generateProgression(difficulty);
        var missingProgressionItem = RandomGenerator.generateNumber(currentProgression.length);
        String[] progressionString = new String[currentProgression.length];

        for (int i = 0; i < currentProgression.length; i++) {
            progressionString[i] = String.valueOf(currentProgression[i]);
        }

        answer = progressionString[missingProgressionItem];
        progressionString[missingProgressionItem] = "..";

        System.out.println("Question: " + String.join(" ", progressionString));

    }

    public String getCorrectAnswer() {
        return answer;
    }
}
