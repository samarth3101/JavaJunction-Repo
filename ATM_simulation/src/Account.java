import java.util.ArrayList;

public class Account {
    private String name;
    private String accountNumber;
    private int pin;
    private double balance;
    private ArrayList<Loan> loans;

    // Static variable for unique account number generation
    private static int accountCounter = 100000;

    // Constructor
    public Account(String name, int pin) {
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;
        this.accountNumber = generateAccountNumber();
        this.loans = new ArrayList<>();
    }

    // Generate Unique Account Number
    private String generateAccountNumber() {
        return "SAM-CAP-" + String.format("%06d", accountCounter++);
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a valid amount.");
        } else {
            balance += amount;
            System.out.printf("₹%.2f deposited successfully to your account.%n", amount);
        }
    }

    // Withdraw Money
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Transaction failed.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("₹%.2f withdrawn successfully from your account.%n", amount);
        }
    }

    // Display Balance
    public void displayBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.printf("Current Balance: ₹%.2f%n", balance);
        } else {
            System.out.println("Incorrect PIN. Cannot display balance.");
        }
    }

    // Apply for Loan
    public void applyForLoan(double amount, String purpose, int tenure, double interestRate) {
        Loan newLoan = new Loan(amount, purpose, tenure);
        newLoan.setInterestRate(interestRate); // Set initial interest rate
        System.out.printf("\nLoan Requested: ₹%.2f | Tenure: %d months%n", amount, tenure);
        System.out.printf("Interest Rate Applied: %.2f%%%n", interestRate);

        System.out.println("Would you like to proceed with this interest rate? (yes/no)");
        String decision = Utils.scanner.next();

        // If user chooses not to proceed, offer a new interest rate
        if (decision.equalsIgnoreCase("no")) {
            System.out.println("Waiting for a better interest rate...");

            try {
                Thread.sleep(3000); // Simulating waiting time for a new rate
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Generate a new, slightly lower interest rate for a better deal
            double betterRate = interestRate - (Math.random() * 1.5);
            if (betterRate < 5.0) {
                betterRate = 5.0; // Ensure rate doesn't go below a reasonable limit
            }

            System.out.printf("New Interest Rate Offered: %.2f%%.%n", betterRate);
            System.out.println("Do you want to accept this new rate? (yes/no)");
            String finalDecision = Utils.scanner.next();

            if (!finalDecision.equalsIgnoreCase("yes")) {
                System.out.println("Loan application canceled.");
                return;
            }

            // Apply the new interest rate
            newLoan.setInterestRate(betterRate);
        }

        // Approve and Credit Loan
        newLoan.approveLoan();
        loans.add(newLoan);
        balance += amount;
        System.out.printf("₹%.2f has been credited to your account.%n", amount);
    }

    // View Loan Details
    public void viewLoans() {
        if (loans.isEmpty()) {
            System.out.println("No active loans found.");
            return;
        }
        System.out.println("\nYour Active Loans:");
        for (Loan loan : loans) {
            System.out.printf(
                    "Amount: ₹%.2f | Interest Rate: %.2f%% | Tenure: %d months | Purpose: %s | Approved: %s%n",
                    loan.getAmount(), loan.getInterestRate(), loan.getTenure(), loan.getPurpose(),
                    loan.isApproved() ? "Yes" : "No");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
}
