import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    static double amountToConvert, convertedAmount;
    static String currencyToConvert, currencyToConvertFrom;

    public static void main(String[] args) {
        System.out.println(" |----------------------------------|");
        System.out.println(" | Welcome to the Currency converter| ");
        System.out.println(" |----------------------------------|");
        System.out.print("Type Start to begin --> ");
        String start = keyboard.nextLine();
        String starterLoop = start.toLowerCase();
        while (starterLoop.equals("start")) {
            System.out.print(
                    "Available Currencies:\n1. USD - United States Dollar\n2. EUR - Euro\n3. GBP - British Pound\n4. JPY - Japanese Yen\nEnter option --> ");
            int userOption = keyboard.nextInt();
            keyboard.nextLine();
            if (userOption == 1) {
                mainDisplay("USD");
            } else if (userOption == 2) {
                mainDisplay("EUR");
            } else if (userOption == 3) {
                mainDisplay("GBP");
            } else if (userOption == 4) {
                mainDisplay("JPY");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.print("Do you wish to start the program again or exit? Enter START or END --> ");
            start = keyboard.nextLine();
            starterLoop = start.toLowerCase();
        }
        keyboard.close(); // Close the scanner to release resources
    }

    public static void mainDisplay(String currencyCode) {
        System.out.print("Enter the amount you want to convert --> ");
        amountToConvert = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter the currency you want to convert from (e.g., USD) --> ");
        currencyToConvertFrom = keyboard.nextLine().toUpperCase();

        double conversionRate = getConversionRate(currencyCode);
        if (conversionRate == 0.0) {
            System.out.println("Invalid currency code.");
        } else {
            convertedAmount = amountToConvert * conversionRate;
            System.out.println("Converted Amount --> " + convertedAmount + " " + currencyCode);
        }
    }

    public static double getConversionRate(String currencyCode) {
        switch (currencyCode) {
            case "USD":
                return 1.0;
            case "EUR":
                return 0.85;
            case "GBP":
                return 0.75;
            case "JPY":
                return 110.0;
            default:
                return 0.0; // Return 0 for invalid currency codes
        }
    }
}

// Version below has issues and calculations were left incomplete;
/*
 * import java.util.Scanner;
 * 
 * public class App {
 * static Scanner keyboard = new Scanner(System.in);
 * 
 * public static void main(String[] args) {
 * System.out.println(" |----------------------------------|");
 * System.out.println(" | Welcome to the Currency converter| ");
 * System.out.println(" |----------------------------------|");
 * System.out.print("Type Start to begin --> ");
 * String start = keyboard.nextLine();
 * String starterLoop = start.toLowerCase();
 * while (starterLoop.equals("start")) {
 * System.out.print(
 * "Available Currencies:\n1. USD - United States Dollar\n2. EUR - Euro\n3. GBP - British Pound\n4. JPY - Japanese Yen\nEnter option --> "
 * );
 * int userOption = keyboard.nextInt();
 * keyboard.nextLine();
 * if (userOption == 1) {
 * mainDisplayUSD();
 * } else if (userOption == 2) {
 * 
 * } else if (userOption == 3) {
 * 
 * } else if (userOption == 4) {
 * 
 * } else {
 * 
 * }
 * System.out.
 * print("Do you wish to go Start the program again or Exit\nEnter START or END --> "
 * );
 * start = keyboard.nextLine();
 * starterLoop = start.toLowerCase();
 * }
 * }
 * 
 * public static void mainDisplayUSD() {
 * System.out.print("Enter the amount you want to convert -->");
 * amountToConvert = keyboard.nextInt();
 * keyboard.nextLine();
 * System.out.print("Enter the amount you want to convert from(e.g USD) -->");
 * currencyToConvertFrom = keyboard.nextLine();
 * String currencyToConvertFromCode = currencyToConvertFrom.toLowerCase();
 * if (currencyToConvertFromCode.equals("USD")) {
 * 
 * }
 * System.out.print("Enter the amount you want to convert to  (e.g EUR) -->");
 * 
 * currencyToConvert = keyboard.nextLine();
 * currencyShortCode = currencyToConvert.toLowerCase();
 * 
 * if (currencyShortCode.equals("eur")) {
 * convertedAmount = amountToConvert * 0.85;
 * System.out.println("Converted Amount --> " + convertedAmount + " " +
 * currencyShortCode.toUpperCase());
 * } else if (currencyShortCode.equals("gbp")) {
 * convertedAmount = amountToConvert * 0.75;
 * System.out.println("Converted Amount --> " + convertedAmount + " " +
 * currencyShortCode.toUpperCase());
 * } else if (currencyShortCode.equals("jpy")) {
 * convertedAmount = amountToConvert * 110.0;
 * System.out.println("Converted Amount --> " + convertedAmount + " " +
 * currencyShortCode.toUpperCase());
 * } else if (currencyShortCode.equals("usd")) {
 * convertedAmount = amountToConvert * 1;
 * System.out.println("Converted Amount --> " + convertedAmount + " " +
 * currencyShortCode.toUpperCase());
 * }
 * 
 * }
 * 
 * static double amountToConvert, convertedAmount;
 * static String currencyToConvert, currencyShortCode, currencyToConvertFrom;
 * }
 */