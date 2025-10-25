package practice;

import java.util.Scanner;

public class SumOfRangeValues{
    public int sumFromto(int num1, int num2){
        int start = (num1 < num2)? num1: num2;
        int end = (num1 > num2)? num1: num2;
        int sum = 0;
        for(int num = start; num <= end; num++){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SumOfRangeValues object = new SumOfRangeValues();
        System.out.print("Enter first value: ");
        int num1 = in.nextInt();
        System.out.print("Enter second value: ");
        int num2 = in.nextInt();

        System.out.print("Sum is " + object.sumFromto(num1, num2));
    }
};