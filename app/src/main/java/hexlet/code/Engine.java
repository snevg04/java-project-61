package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public final class Engine {
    private static final Scanner scanner = new Scanner(System.in);

    public static void run(String rules, String[][] rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);

        for (String[] round : rounds) {
            String question = round[0];
            String answer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(("'" + userAnswer + "' is wrong answer ;(."
                        + "Correct answer was '" + answer + "'."));
                System.out.println("Let's try again, " + userName + "!");
                return;
            }


        }

        System.out.println("Congratulations, " + userName + "!");

    }
}




    //System.out.println("Question: " + question);
//    public void run() {
//        greeting();
//        game.getRules();
//        var score = 0;
//        while (score < ROUNDS_TO_WIN) {
//            game.getQuestion();
//
//            var correctAnswer = game.getCorrectAnswer();
//
//            if (userAnswer.equals(correctAnswer)) {
//                score += 1;
//                System.out.println("Correct!");
//            } else {
//                System.out.println(("'" + userAnswer + "' is wrong answer ;(."
//                        + "Correct answer was '" + correctAnswer + "'."));
//                System.out.println("Let's try again, " + name + "!");
//                return;
//            }
//        }
//        System.out.println("Congratulations, " + name + "!");
//
//    }
//
//    public void greeting() {
//        System.out.println("Welcome to the Brain Games!");
//        System.out.println("May I have your name?");
//        name = Cli.scanInput();
//        System.out.println("Hello, " + name + "!");
//    }

//}

//    private static String name;
//    private static final int GREET_GAME = 1;
//    private static final int EVEN_GAME = 2;
//    private static final int CALC_GAME = 3;
//    private static final int GCD_GAME = 4;
//    private static final int PROGRESSION_GAME = 5;
//    private static final int PRIME_GAME = 6;
//    private static final int EXIT = 0;
//    private static final int ROUNDS_TO_WIN = 3;