class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds balance.");
        } else {
            this.balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f\n", amount, this.balance);
        }
    }
    
    public double getBalance() {
        return this.balance;
    }
}

public class Account {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        System.out.println("Account created with balance: $" + account.getBalance());

        System.out.println("\n--- 1. Attempting to withdraw $500.00 ---");
        try {
            account.withdraw(500.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- 2. Attempting to withdraw $700.00 ---");
        try {
            account.withdraw(700.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Current balance remains: $" + account.getBalance());
        }
    }
}
