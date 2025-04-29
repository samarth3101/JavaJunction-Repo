import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Samarth Capital & Co.");

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Login to Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    loginToAccount();
                    break;
                case 3:
                    System.out.println("Thank you for banking with Samarth Capital & Co. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Create Account
    public static void createAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Set a 4-digit PIN: ");
        int pin = scanner.nextInt();

        if (String.valueOf(pin).length() != 4) {
            System.out.println("Invalid PIN. Must be 4 digits.");
            return;
        }

        Account newAccount = new Account(name, pin);
        accounts.add(newAccount);
        System.out.println("Account created successfully at Samarth Capital & Co.!");
        System.out.println("Your Account Number: " + newAccount.getAccountNumber());
    }

    // Login to Account
    public static void loginToAccount() {
        System.out.print("Enter your Account Number (e.g., SAM-CAP-000123): ");
        String accNumber = scanner.next();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        Account account = findAccount(accNumber);

        if (account != null && account.verifyPin(pin)) {
            System.out.println("Login successful! Welcome, " + account.getName());
            showAccountMenu(account);
        } else {
            System.out.println("Invalid Account Number or PIN.");
        }
    }

    // Find Account by Account Number
    public static Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Account Operations Menu
    public static void showAccountMenu(Account account) {
        while (true) {
            System.out.println("\nWelcome to Samarth Capital & Co. " + account.getName());
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Apply for Loan");
            System.out.println("5. View Loan Details");
            System.out.println("6. Logout");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            switch (choice) {
                case 1:
                    System.out.print("Enter your PIN to check balance: ");
                    int checkPin = scanner.nextInt();
                    account.displayBalance(checkPin);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.print("Enter your PIN: ");
                    int withdrawPin = scanner.nextInt();
                    account.withdraw(withdrawAmount, withdrawPin);
                    break;
                case 4:
                    applyForLoan(account);
                    break;
                case 5:
                    account.viewLoans();
                    break;
                case 6:
                    System.out.println("Logging out... Thank you for banking with Samarth Capital & Co.!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }

    // Apply for Loan with Rate Simulation
    public static void applyForLoan(Account account) {
        System.out.print("Enter Loan Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter Purpose of Loan: ");
        String purpose = scanner.nextLine();
        System.out.print("Enter Loan Tenure (in months): ");
        int tenure = scanner.nextInt();

        double interestRate = getInterestRate(tenure);
        System.out.printf("The current interest rate for %d months is %.2f%%.\n", tenure, interestRate);
        account.applyForLoan(amount, purpose, tenure, interestRate);
    }

    // Generate Interest Rate
    public static double getInterestRate(int tenure) {
        double baseRate = 8.0;
        double variableRate = Math.random() * 3.0;
        return baseRate + (tenure / 12.0) + variableRate;
    }
}
