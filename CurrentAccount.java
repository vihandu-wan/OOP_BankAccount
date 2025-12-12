class CurrentAccount extends BankAccount{
    private double overDraft;
    private double monthlyFee;

    public CurrentAccount(String name,double balance){
        super(name,balance);
        System.out.println("Current Account added!");
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    public void withdrow(double amount){
        if((balance+overDraft)>amount){
            balance-=amount;
            System.out.println("Money withdrew: "+ amount);
        }else{
            System.out.println("Account Balance IS LOW!");
        }
    }

    public double getBalance(){
        return super.getBalance();
    } 

    public void applyMonthlyProcess(){
        if(balance>=monthlyFee){
            balance-=monthlyFee;
            System.out.println("Account Balance : "+balance);
        }else{
            System.out.println("Insufficent Balance!");
        }
    }

}