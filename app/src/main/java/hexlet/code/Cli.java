package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String scanInput() {
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        return input;
    }
}
