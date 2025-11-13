

import java.util.Scanner;

public class stockmanagement {

    static final int MAX_STOCKS = 100;

    static String[] stockNames = new String[MAX_STOCKS];
    static int[] stockShares = new int[MAX_STOCKS];
    static double[] stockPrices = new double[MAX_STOCKS];

    static int stockCount = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStock();
                    break;
                case 2:
                    sellStock();
                    break;
                case 3:
                    viewPortfolio();
                    break;
                case 4:
                    calculateTotalValue();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice (1-5).");
            }
            System.out.println(); 
        }
    }

    public static void showMenu() {
        System.out.println("--- Stock Manager ---");
        System.out.println("1. Add Stock");
        System.out.println("2. Sell Stock");
        System.out.println("3. View Portfolio");
        System.out.println("4. Total Value");
        System.out.println("5. Exit");
        System.out.print("Choice: ");
    }

    public static void addStock() {
        if (stockCount >= MAX_STOCKS) {
            System.out.println("Portfolio full.");
            return;
        }

        System.out.print("Stock name: ");
        String name = scanner.nextLine();

        System.out.print("Shares: ");
        int shares = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        stockNames[stockCount] = name;
        stockShares[stockCount] = shares;
        stockPrices[stockCount] = price;

        stockCount++;

        System.out.println("Stock added.");
    }

    public static void sellStock() {
        if (stockCount == 0) {
            System.out.println("Portfolio empty.");
            return;
        }

        System.out.print("Stock to sell: ");
        String name = scanner.nextLine();

        int index = findStockIndex(name);

        if (index == -1) {
            System.out.println("Stock not found: " + name);
            return;
        }

        System.out.println("You own " + stockShares[index] + " shares.");
        System.out.print("Shares to sell: ");
        int sharesToSell = scanner.nextInt();
        scanner.nextLine(); 

        if (sharesToSell <= 0) {
            System.out.println("Sell amount must be positive.");
        } else if (sharesToSell > stockShares[index]) {
            System.out.println("Not enough shares. You have " + stockShares[index]);
        } else if (sharesToSell == stockShares[index]) {
            removeStock(index);
            System.out.println("Sold all " + name + ".");
        } else {
            stockShares[index] = stockShares[index] - sharesToSell;
            System.out.println("Sold " + sharesToSell + " shares. " + stockShares[index] + " remaining.");
        }
    }

    public static int findStockIndex(String name) {
        for (int i = 0; i < stockCount; i++) {
            if (stockNames[i].equalsIgnoreCase(name)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void removeStock(int index) {
        for (int i = index; i < stockCount - 1; i++) {
            stockNames[i] = stockNames[i + 1];
            stockShares[i] = stockShares[i + 1];
            stockPrices[i] = stockPrices[i + 1];
        }

        stockCount--;

        stockNames[stockCount] = null;
        stockShares[stockCount] = 0;
        stockPrices[stockCount] = 0.0;
    }

    public static void viewPortfolio() {
        if (stockCount == 0) {
            System.out.println("Portfolio empty.");
            return;
        }

        System.out.println("--- Your Portfolio ---");
        System.out.println("------------------------------------------");

        for (int i = 0; i < stockCount; i++) {
            double value = stockShares[i] * stockPrices[i];

            System.out.printf("%-10s | %-5d | $%-10.2f | $%-10.2f%n",
                    stockNames[i], stockShares[i], stockPrices[i], value);
        }
        System.out.println("------------------------------------------");
    }

    public static void calculateTotalValue() {
        if (stockCount == 0) {
            System.out.println("Portfolio empty. Value: $0.00");
            return;
        }
        double totalValue = recursiveCalculateValue(0);
        System.out.printf("Total Portfolio Value: $%.2f%n", totalValue);
    }

    public static double recursiveCalculateValue(int index) {
        if (index == stockCount) {
            return 0;
        }

        double currentValue = stockShares[index] * stockPrices[index];

        double valueOfRest = recursiveCalculateValue(index + 1); 

        return currentValue + valueOfRest;
    }
}