package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    private static String name;

    public Engine() {

    }

    public void launch() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 – Greet
                2 - Even
                3 – Calculator
                4 – GCD
                5 – Progression
                6 – Prime
                0 – Exit
                """
        );
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(Cli.scanInput());

        switch (choice) {
            case 1:
                greeting();
                break;
            case 2:
                run(new Even());
                break;
            case 3:
                run(new Calculator());
                break;
            case 4:
                run(new GCD());
                break;
            case 5:
                run(new Progression());
                break;
            case 6:
                run(new Prime());
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid number. Please insert correct number.");
                System.out.println(" ");
                launch();
                break;
        }
    }

    public void run(BrainGamesAPI game) {
        greeting();
        game.getRules();
        var score = 0;
        while (score < 3) {
            game.getQuestion();
            var correctAnswer = game.getCorrectAnswer();
            var userAnswer = Cli.scanInput();
            if (userAnswer.equals(correctAnswer)) {
                score += 1;
            } else {
                System.out.println(("'" + userAnswer + "' is wrong answer ;(."
                        + "Correct answer was '" + correctAnswer + "'."));
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }

    public void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = Cli.scanInput();
        System.out.println("Hello, " + name + "!");
    }

}
