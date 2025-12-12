class personalLoanAccount extends BankAccount implements LoanAccount{
    private double totalLoanAmount;
    private double remainLoanAmount;
    private double emiAmount;


    public personalLoanAccount(String name,double loanAmount,double emiAmount){
        super(name,0);
        this.totalLoanAmount=loanAmount;
        this.emiAmount=emiAmount;
        this.remainLoanAmount=loanAmount;
    }

    public double getOutstanding(){
        return remainLoanAmount;
    }
    
    public void deductEMI(){
        if(totalLoanAmount!=0){
            remainLoanAmount-=emiAmount;
            System.out.println("EMI deducted!");
        }else{
            System.out.println("Loan is zero!");
        }
    }

    public void applyMonthlyProcess(){
        deductEMI();
        System.out.println("");
        System.out.println("Remain : "+getOutstanding());
    }
    
}