package javaapplication41;
import java.util.Scanner;
final class BankUtils {
    public static final String BANK_NAME = "YASH BANK OF INDIA";
    public final void displayBankInfo() {
        System.out.println("Welcome to " + BANK_NAME);
    }
}

class BankAccount {
    private final String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankUtils bankUtils = new BankUtils();
        bankUtils.displayBankInfo();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance (₹): ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, name, initialBalance);

        System.out.println("\nAccount Created Successfully");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Bank: " + BankUtils.BANK_NAME);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: ₹ " + account.getBalance());

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount (₹): ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount (₹): ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Available Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for banking with " + BankUtils.BANK_NAME);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}