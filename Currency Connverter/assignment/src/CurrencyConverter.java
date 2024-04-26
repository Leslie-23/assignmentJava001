import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Map<String, Map<String, Double>> exchangeRates = new HashMap<>();

    static {
        // Initialize exchange rates
        Map<String, Double> usdRates = new HashMap<>();
        usdRates.put("USD", 1.0);
        usdRates.put("EUR", 0.85);
        usdRates.put("GBP", 0.75);
        usdRates.put("JPY", 110.0);

        Map<String, Double> eurRates = new HashMap<>();
        eurRates.put("USD", 1.18);
        eurRates.put("EUR", 1.0);
        eurRates.put("GBP", 0.88);
        eurRates.put("JPY", 129.09);

        Map<String, Double> gbpRates = new HashMap<>();
        gbpRates.put("USD", 1.33);
        gbpRates.put("EUR", 1.13);
        gbpRates.put("GBP", 1.0);
        gbpRates.put("JPY", 146.25);

        Map<String, Double> jpyRates = new HashMap<>();
        jpyRates.put("USD", 0.0091);
        jpyRates.put("EUR", 0.0078);
        jpyRates.put("GBP", 0.0068);
        jpyRates.put("JPY", 1.0);

        exchangeRates.put("USD", usdRates);
        exchangeRates.put("EUR", eurRates);
        exchangeRates.put("GBP", gbpRates);
        exchangeRates.put("JPY", jpyRates);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Welcome to the Currency Converter");
            System.out.println("---------------------------------");

            displayCurrencies();

            System.out.print("Enter the amount you want to convert: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            while (amount < 0) {
                System.out.println("Invalid amount <--> Try again");
                break;

            }
            System.out.print("Enter the currency you want to convert from (e.g., USD): ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            if (!exchangeRates.containsKey(fromCurrency)) {
                System.out.println("Invalid currency code.");
                continue;
            }

            System.out.print("Enter the currency you want to convert to (e.g., EUR): ");
            String toCurrency = scanner.nextLine().toUpperCase();

            if (!exchangeRates.containsKey(toCurrency)) {
                System.out.println("Invalid currency code.");
                continue;
            }

            double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
            System.out.printf("Converted amount: %.2f %s%n%n", convertedAmount, toCurrency);

            System.out.print("Do you want to convert another amount? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you for using the Currency Converter.");
                break;
            }
        }
        scanner.close();
    }

    private static void displayCurrencies() {
        System.out.println("Available Currencies:");
        System.out.println("1. USD - United States Dollar");
        System.out.println("2. EUR - Euro");
        System.out.println("3. GBP - British Pound");
        System.out.println("4. JPY - Japanese Yen");
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // double fromRate = exchangeRates.get(fromCurrency).get(toCurrency);
        double toRate = exchangeRates.get(toCurrency).get(fromCurrency);
        return amount * toRate;
    }
}
