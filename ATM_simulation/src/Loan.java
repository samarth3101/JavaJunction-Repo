import java.util.Random;

public class Loan {
    private double amount;
    private String purpose;
    private int tenure; // in months
    private double interestRate;
    private boolean approved;

    // Constructor
    public Loan(double amount, String purpose, int tenure) {
        this.amount = amount;
        this.purpose = purpose;
        this.tenure = tenure;
        this.interestRate = calculateInterestRate(tenure);
        this.approved = false;
    }

    // Calculate Interest Rate Based on Tenure
    private double calculateInterestRate(int tenure) {
        if (tenure <= 12) {
            return 7.5;
        } else if (tenure <= 24) {
            return 8.5;
        } else if (tenure <= 36) {
            return 9.0;
        } else {
            return 10.0;
        }
    }

    // Simulate a Better Interest Rate (Random Reduction)
    public double getBetterInterestRate() {
        Random random = new Random();
        double reduction = random.nextDouble() * 1.5; // Up to 1.5% reduction
        return Math.max(5.0, this.interestRate - reduction); // Min 5% interest
    }

    // Approve Loan
    public void approveLoan() {
        this.approved = true;
        System.out.println("\nLoan Approved!");
        System.out.printf("Loan Amount: ₹%.2f | Interest Rate: %.2f%% | Tenure: %d months%n",
                amount, interestRate, tenure);
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
