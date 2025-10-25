package customexception;

import java.util.Scanner;
import java.lang.Exception;

class DivideByZeroException extends Exception{
    private String msg = null;
    public DivideByZeroException(String message){
        this.msg = message;
    }

    public void showError(){
        System.out.println("Exception: " + msg);
    }
};

public class Calculator{
    public void division(int numerator, int denominator){
        if(denominator == 0){
            try{
                throw new DivideByZeroException("Divide by Zero!");
            }
            catch(DivideByZeroException e){
                e.showError();
                // e.printStackTrace();
            }
        }
        else{
           System.out.println("Division is " + numerator/denominator);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Calculator object = new Calculator();
        System.out.print("Enter numerator: ");
        int num1 = in.nextInt();
        System.out.print("Enter numerator: ");
        int num2 = in.nextInt();
        object.division(num1, num2);
    }
};