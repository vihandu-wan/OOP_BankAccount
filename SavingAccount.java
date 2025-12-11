import java.util.Scanner;
class SavingAccount extends BankAccount{
    
    public SavingAccount(String name,double amount){
        super(name,amount);
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
    
    
    public static void main(String args[]){

    Scanner input=new Scanner(System.in);
        System.out.print("Name of the account holder : ");
        String name = input.nextLine();
        System.out.println();
        System.out.print("Account Balance : ");
        double balance = input.nextDouble();

    SavingAccount bankAccount= new SavingAccount(name,balance);
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
                double balanceo=bankAccount.getBalance();
                if(balanceo==-1){
                    System.out.println("Zero Balance Error");
                }else{
                    System.out.println("Your Balance : "+balanceo);
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