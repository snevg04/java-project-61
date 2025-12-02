package hexlet.code;

class App {
    public static void main(String[] args) {
        App.takeYourPick();
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");

        System.out.println("May I have your name?");
        var name = Cli.scanInput();
        System.out.println("Hello, " + name + "!");
    }

    public static void takeYourPick() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 – Greet
                0 – Exit
                """
        );
        System.out.print("Your choice: ");

        var pick = Cli.scanInput();

        switch (pick) {
            case "1":
                App.greeting();
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid option");
                App.takeYourPick();
        }

    }
}
