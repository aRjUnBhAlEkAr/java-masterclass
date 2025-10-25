package customexception;

import java.util.Scanner;
import java.lang.Exception;

class InsufficientBalanceException extends Exception{
    private String message = null;

    public InsufficientBalanceException(String message){
        this.message = message;
    }

    public void showException(){
        System.out.println("Exception: " + message);
    }
};

public class BankAccount{
    Scanner in;
    private double balance = 123.02;

    public void withdraw(){
        in = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = in.nextDouble();
        if(balance >= amount){
            balance-=amount;
        }
        else{
            try{
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            catch(InsufficientBalanceException e){
                e.showException();
            }
        }
        in.close();
    }

    public static void main(String[] args){
        BankAccount object = new BankAccount();
        object.withdraw();
    }
};