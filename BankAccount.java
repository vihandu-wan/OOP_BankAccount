import java.util.Scanner;
class BankAccount{
    private double balance;

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

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        BankAccount bankAccount= new BankAccount();
    while(true){
        System.out.println();
        System.out.println("Welcome TO Wallet Bank");
        System.out.println();
        System.out.println("[1]Deposit Money");
        System.out.println("[2]Withdrow Money");
        System.out.println("[3]Get Balance");
        System.out.println();
        System.out.println();
        System.out.print("Select Your NEED! [1,2,3, Exit : -1] : ");
        int option=input.nextInt();
        System.out.println();


        switch(option){
            case 1:
                System.out.print("Enter your deposit ammount : ");
                double ammountDepo=input.nextDouble();
                bankAccount.deposit(ammountDepo);
                break;
            case 2:
                System.out.print("Enter your withdraw ammount : ");
                double ammountWithdro=input.nextDouble();
                bankAccount.withdrow(ammountWithdro);
                break;
            case 3:
                double balance=bankAccount.getBalance();
                if(balance==-1){
                    System.out.println("Zero Balance Error");
                }else{
                    System.out.println("Your Balance : "+balance);
                }
                break;
            case -1:
                System.out.println("System closed!");
                return;
            default:
                System.out.println("Enter valid ammount?");
                continue;

        }
    }



    }
}