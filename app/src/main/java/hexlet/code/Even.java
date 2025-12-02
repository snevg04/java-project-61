package hexlet.code;

import java.util.Random;

class Even {
    public static void playGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var score = 0;
        while (score < 3) {
            var answer = Even.takeTurn();

            if (answer.equals("correct")) {
                score+= 1;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + App.name + "!");
    }

    public static String takeTurn() {
        var currentNumber = Even.getRandomNumber();
        var correctAnswer = currentNumber % 2 == 0 ? "yes" : "no";

        System.out.println("Question: " + currentNumber);
        System.out.print("Your answer " );

        var answer = Cli.scanInput();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return "correct";
        } else {
            System.out.println(("'" + answer + "' is wrong answer ;(. " +
                    "Correct answer was '" + correctAnswer + "'"));
            System.out.println("Let's try again, " + App.name + "!");
            return "incorrect";
        }

    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }

}
