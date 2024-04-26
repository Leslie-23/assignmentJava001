import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise 1: Character Search\n");

        // Prompt user to enter a string
        System.out.print("Enter a string (letters and spaces only): ");
        String inputString = scanner.nextLine().toLowerCase();

        // Validate input string
        while (!inputString.matches("[a-z ]+")) {
            System.out.print("Invalid input! Enter a string containing only letters and spaces: ");
            inputString = scanner.nextLine().toLowerCase();
        }

        // Hangman game loop
        while (true) {
            System.out.print("Enter a character (or press Enter to quit): ");
            String searchCharInput = scanner.nextLine().toLowerCase();

            // Check if user wants to quit
            if (searchCharInput.isEmpty()) {
                System.out.println("Game over! Thanks for playing.");
                break;
            }

            // Validate search character input
            while (searchCharInput.length() != 1 || !Character.isLetter(searchCharInput.charAt(0))) {
                System.out.print("Invalid input! Enter a single letter: ");
                searchCharInput = scanner.nextLine().toLowerCase();
            }
            char searchChar = searchCharInput.charAt(0);

            // Check if character exists in the string
            if (inputString.indexOf(searchChar) != -1) {
                // Display string with instances of the character and underscores for other
                // letters
                StringBuilder displayString = new StringBuilder();
                for (char c : inputString.toCharArray()) {
                    if (c == searchChar || c == ' ') {
                        displayString.append(c);
                    } else {
                        displayString.append('_');
                    }
                }
                System.out.println("Display string with instances of the character: " + displayString);
            } else {
                System.out.println("Sorry, '" + searchChar + "' does not exist in the phrase.");
            }
        }

        scanner.close();
    }
}
