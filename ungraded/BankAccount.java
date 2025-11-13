public class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate = 5.0;
    public static final double MINIMUM_BALANCE = 1000.0;
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void displayDetails() {
        System.out.println( accountHolderName);
        System.out.println( balance);
        System.out.println(interestRate );
        System.out.println(MINIMUM_BALANCE);
    }
    public static void changeInterestRate(double newRate) {
        interestRate = newRate;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Soumitya Pandey", 15000);
        BankAccount acc2 = new BankAccount("Riya Sharma", 12000);
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.changeInterestRate(6.5);
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
