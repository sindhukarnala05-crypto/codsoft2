import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hardcoded exchange rates (base: 1 USD)
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("INR", 83.0);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.79);
        rates.put("JPY", 147.0);

        System.out.println("Available currencies: " + rates.keySet());

        // Base currency
        System.out.print("Enter base currency (e.g., USD): ");
        String base = sc.next().toUpperCase();

        // Target currency
        System.out.print("Enter target currency (e.g., INR): ");
        String target = sc.next().toUpperCase();

        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println("❌ Invalid currency code.");
            sc.close();
            return;
        }

        // Amount input
        System.out.print("Enter amount in " + base + ": ");
        double amount = sc.nextDouble();

        // Conversion
        double converted = amount * (rates.get(target) / rates.get(base));

        System.out.println("\n===== RESULT =====");
        System.out.println(amount + " " + base + " = " + converted + " " + target);

        sc.close();
    }
}
