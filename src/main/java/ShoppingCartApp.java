import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale locale;
        ResourceBundle rb;

        int numberOfItems = 0;
        double totalCostOfItem = 0.0;
        double price = 0.0;
        int quantity = 0;
        double totalCost = 0.0;

        System.out.println("Select the language: 1. English 2. suomi 3. svenska 4. 日本語");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> locale = new Locale("en", "US");
            case 2 -> locale = new Locale("fi", "FI");
            case 3 -> locale = new Locale("sv", "SE");
            case 4 -> locale = new Locale("ja", "JP");
            default -> locale = new Locale("en", "US");
        }
        try {
            rb = ResourceBundle.getBundle("messages", locale);
        } catch (Exception e) {
            System.out.println("Invalid choice. Defaulting to English.");
            rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }

        System.out.println(rb.getString("items")+ " ");
        numberOfItems = sc.nextInt();
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(rb.getString("item") + " " + (i + 1) + ":");
            System.out.println(rb.getString("price")+ " ");
            price = sc.nextDouble();
            System.out.println(rb.getString("quantity")+ " ");
            quantity = sc.nextInt();
            totalCostOfItem = CalculateItemCost(price, quantity);
            totalCost = CalculateTotalCost(totalCostOfItem, totalCost);
        }

        System.out.printf(rb.getString("total") + " %.2f€\n", totalCost);
    }

    public static double CalculateItemCost(double price, int quantity) {
        return price * quantity;
    }

    public static double CalculateTotalCost(double totalCostOfItem, double totalCost) {
        return totalCostOfItem + totalCost;
    }
}
