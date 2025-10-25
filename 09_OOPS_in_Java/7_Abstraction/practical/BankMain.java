package bank;

interface BankOperation{
    void deposite(double amount);
    void withdraw(double amount);
    void checkBalance();
};

interface LoanOperation{
    void applyLoan(double loanAmount);
    void checkLoanStatus();
};

class UserAccount implements BankOperation, LoanOperation{
    private double balance;
    private boolean loanApproved;
    private double loanAmount;

    @Override
    public void deposite(double amount){
        if(amount < 0){
            System.out.println("Deposite amount must be greater than 0");
        }
        else{
            balance+=amount;
        }
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance-=amount;
        }
        else{
            System.out.println("Unable to Withdraw");
        }
    }

    @Override
    public void applyLoan(double loanAmount){
        if(loanAmount > 0 && balance >= 10000){
            loanApproved = true;
            this.loanAmount = loanAmount;
        }
        else{
            System.out.println("Your loan cannot be approved!, Minimum Balance required is 10000");
        }
    }

    @Override
    public void checkLoanStatus(){
        if(loanApproved){
            System.out.println("Loan Amount: " + loanAmount);
        }
        else{
            System.out.println("Your loan is not approved!");
        }
    }

    @Override
    public void checkBalance(){
        System.out.println("Balance is " + balance);
    }
};

public class BankMain{
    public static void main(String[] args){
        UserAccount user = new UserAccount();

        System.out.println("Initial User Account Status:");
        // System.out.println("Balance: " + user.balance + "\nLoan is Approved: " + user.loanApproved + "\nLoan Amount: " + user.loanAmount + "\n");
        
        System.out.println("Deposite of Amount");
        user.deposite(15000);
        user.checkBalance();

        System.out.println("Withdraw of Amount");
        user.withdraw(7000);
        user.checkBalance();

        System.out.println("Apply Loan");
        user.applyLoan(5000);
        user.checkLoanStatus();
    }
};