abstract class Account {
    protected String accountHolder;
    protected long accountNumber;
    protected double balance;

    public Account(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public abstract double calculateInterest();

   
     
    public void displayDetails() {
        System.out.println("---------------------------------");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.printf("Current Balance: $%,.2f\n", this.balance);
    }
}


class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate; // e.g., 4.5 for 4.5%
    }

    
    @Override
    public double calculateInterest() {
        return this.balance * (this.interestRate / 100.0);
    }
}


class CurrentAccount extends Account {
    
    private static final double FIXED_INTEREST_RATE = 0.5; // 0.5%

    public CurrentAccount(String accountHolder, long accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

   
    @Override
    public double calculateInterest() {
        return this.balance * (FIXED_INTEREST_RATE / 100.0);
    }
}



public class AccountClass {
    public static void main(String[] args) {
        System.out.println("--- Bank Interest Calculation System ---");

        
        
       
        Account acc1;
        
        
        acc1 = new SavingAccount("Rohan Sharma", 1001, 50000.0, 4.5); // 4.5% interest

      
        Account acc2;
        
        
        acc2 = new CurrentAccount("Om Patil", 2001, 120000.0); // 0.5% interest

        
        
        System.out.println("\n--- Savings Account Details ---");
        acc1.displayDetails();
        System.out.printf("Interest Earned: $%,.2f\n", acc1.calculateInterest());

        System.out.println("\n--- Current Account Details ---");
        acc2.displayDetails();
        System.out.printf("Interest Earned: $%,.2f\n", acc2.calculateInterest());
    }
}
