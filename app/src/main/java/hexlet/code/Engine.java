package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public final class Engine {
    private static String name;
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;

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

        int choice;

        try {
            choice = Integer.parseInt(Cli.scanInput());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please insert correct number.");
            System.out.println(" ");
            launch();
            return;
        }


        switch (choice) {
            case GREET_GAME:
                greeting();
                break;
            case EVEN_GAME:
                run(new Even());
                break;
            case CALC_GAME:
                run(new Calculator());
                break;
            case GCD_GAME:
                run(new GCD());
                break;
            case PROGRESSION_GAME:
                run(new Progression());
                break;
            case PRIME_GAME:
                run(new Prime());
                break;
            case EXIT:
                break;
            default:
                System.out.println("Invalid input. Please insert correct number.");
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
            System.out.print("Your answer: ");
            var correctAnswer = game.getCorrectAnswer();
            var userAnswer = Cli.scanInput();
            if (userAnswer.equals(correctAnswer)) {
                score += 1;
                System.out.println("Correct!");
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
