package hexlet.code;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");

        System.out.println("May I have your name?");
        var name = Cli.scanInput();
        System.out.println("Hello, " + name + "!");

    }
}
