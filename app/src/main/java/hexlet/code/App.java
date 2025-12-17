package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        launchMenu();
    }

    public static void launchMenu() {
        Scanner scanner = new Scanner(System.in);

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

        String choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.run();
                break;
            case "3":
                Calculator.run();
                break;
            case "4":
                GCD.run();
                break;
            case "5":
                Progression.run();
                break;
            case "6":
                Prime.run();
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid input. Please insert correct number.");
                System.out.println(" ");
                launchMenu();
                break;
        }
    }
}
