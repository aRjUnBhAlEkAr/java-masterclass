package trycatch;

import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class LoopException{
    public void divideArrayElement(int[] array, int divisor){
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index]/divisor);
        }
    }
};

public class MultiplicationSExample{
    public void calculate(String num1, String num2){
        try{
            int numerator = Integer.parseInt(num1);
            int denominator = Integer.parseInt(num2);
            System.out.println("Division is " + numerator/denominator);
        }
        catch(NumberFormatException | ArithmeticException e){
            e.printStackTrace();
            System.out.println("End of catch() block");
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MultiplicationSExample object = new MultiplicationSExample();
        System.out.print("Enter first number: ");
        String num1 = in.next();
        System.out.print("Enter second number: ");
        String num2 = in.next();

        object.calculate(num1, num2);
    }
};