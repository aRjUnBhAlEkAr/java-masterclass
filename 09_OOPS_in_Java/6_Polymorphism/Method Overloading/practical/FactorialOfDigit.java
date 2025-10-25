package practice;

import java.util.Scanner;

class FactorialOfDigit{
    public int factorial(int input){
        int result = 1;
        for(int num = 2; num <= input; num++){
            result*=num;
        }
        return result;
    }

    public void seperateDigit(int num){
        int value = num, remain = 0, result = 0;
        while(value != 0){
            remain = value%10;
            result = result * 10 + remain;
            value/=10;
        }

        value = result;

        while(value != 0){
            remain = value%10;
            System.out.println("Factorial of " + remain + " is " + factorial(remain));
            value/=10;
        }
    }

    public static void main(String[] args){
        FactorialOfDigit object = new FactorialOfDigit();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        object.seperateDigit(in.nextInt());
    }
};