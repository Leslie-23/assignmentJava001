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

        // Prompt user to enter a single character
        System.out.print("Enter a single character (letter): ");
        String searchCharInput = scanner.nextLine().toLowerCase();

        // Validate search character input
        while (searchCharInput.length() != 1 || !Character.isLetter(searchCharInput.charAt(0))) {
            System.out.print("Invalid input! Enter a single letter: ");
            searchCharInput = scanner.nextLine().toLowerCase();
        }
        char searchChar = searchCharInput.charAt(0);

        // Exercise 1a: Check if character exists in string
        boolean charExists = inputString.indexOf(searchChar) != -1;
        System.out.println("Character exists in the string: " + charExists);

        // Exercise 1b: Count occurrences of character in string
        int charCount = 0;
        for (char c : inputString.toCharArray()) {
            if (c == searchChar) {
                charCount++;
            }
        }
        System.out.println("Number of times the character appears in the string: " + charCount);

        // Exercise 1c: Display string with instances of the character and underscores
        // for other letters
        StringBuilder displayString = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c == searchChar || c == ' ') {
                displayString.append(c);
            } else {
                displayString.append('_');
            }
        }
        System.out.println("Display string with instances of the character: " + displayString);

        scanner.close();
    }
}
