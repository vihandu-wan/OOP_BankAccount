import java.util.Scanner;
class BankAccount{
    protected String name;
    protected double balance;
    
    public BankAccount(String name,double amount){
        this.name=name;
        this.balance=amount;
    }

    public void deposit(double amount){
        if(balance >=0){
            balance+=amount;
            System.out.println("Money deposited!");
        }else{
            System.out.println("Error 120");
        }
    }


    public void withdrow(double amount){
        if(balance>(amount+50)){
            balance-=amount;
            System.out.println("Money withdrew!");
        }else{
            System.out.println("Account Balance IS LOW!");
        }
    }

    public double getBalance(){
        if(balance>0){
            return balance;
        }
        return -1;
    }
}