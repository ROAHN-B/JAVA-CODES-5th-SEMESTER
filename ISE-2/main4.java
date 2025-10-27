class Account{
    double balance;

    Account(double balance){
        this.balance=balance;
    }

    public double CalulateInterest(){
        return 0.0;
    } 
}

class SavingsAccount extends Account{
    double interest = 0.04; 

    SavingsAccount(double balance){
        super(balance);
    }

    @Override
    public double CalulateInterest(){
        return balance*interest;
    }

    
}

class CurrentAccount extends Account{
    double interest = 0.02; 

    CurrentAccount(double balance){
        super(balance);
    }

    @Override
    public double CalulateInterest(){
        return balance*interest;
    }

    
}

public class main4{
    public static void main(String[] arg){
        Account acc1 = new SavingsAccount(20000);
        Account acc2 = new CurrentAccount(30000);

        

        System.out.println("Savings Account interest  is : "+acc1.CalulateInterest());
         System.out.println("Current Account interest is : "+acc2.CalulateInterest());
    }
}


