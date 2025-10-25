package exception;

import java.util.Scanner;

public class ArithmeticExceptionDemo{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        try{
            System.out.print("Enter first value: ");
            int num1 = in.nextInt();
            System.out.print("Enter second value: ");
            int num2 = in.nextInt();
            System.out.println("Division is " + num1/num2);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
};