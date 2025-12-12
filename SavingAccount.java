import java.util.Scanner;
class SavingAccount extends BankAccount{
    private double interestRate;
    
    public SavingAccount(String name,double amount){
        super(name,amount);
        System.out.println("Saving Account added!");
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    public void withdrow(double amount){
        super.withdrow(amount);
    }

    public double getBalance(){
        return super.getBalance();
    }    

    public void applyMonthlyProcess(){
        balance+=balance*interestRate;
        System.out.println("Monthly Process Concluded : "+balance+ " LKR");
    }
}