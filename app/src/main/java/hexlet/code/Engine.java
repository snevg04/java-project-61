package hexlet.code;

import java.util.Scanner;

public final class Engine {

    public static void run(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
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
