public class BankSimulation {
    public static void main(String[] args) {
        Account sharedAccount = new Account(1000);
        System.out.println("Initial Balance: " + sharedAccount.getBalance());

        Customer c1 = new Customer(sharedAccount, "Alice", 600);
        Customer c2 = new Customer(sharedAccount, "Bob", 300);
        Customer c3 = new Customer(sharedAccount, "Charlie", 500);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + sharedAccount.getBalance());
    }
}

class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(String customerName, int amount) {
        System.out.println(customerName + " is trying to withdraw " + amount);
        if (this.balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance = this.balance - amount;
            System.out.println(customerName + " successfully withdrew " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println(customerName + " failed to withdraw " + amount + ". Insufficient funds. Balance: " + this.balance);
        }
    }
}

class Customer implements Runnable {
    private Account account;
    private String name;
    private int withdrawAmount;

    public Customer(Account account, String name, int withdrawAmount) {
        this.account = account;
        this.name = name;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        account.withdraw(name, withdrawAmount);
    }
}
