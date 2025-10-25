package practice;

import java.util.Scanner;

public class AbsoluteDifference{
    public int absDiff(int num){
        int value = num, remain = 0, result = 0;

        while(value != 0){
            remain = value%10;
            result = result * 10 + remain;
            value/=10;
        }

        return result - num;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        AbsoluteDifference object = new AbsoluteDifference();

        System.out.print("Enter a value: ");
        int input = in.nextInt();
        System.out.print("Absolute Difference is " + object.absDiff(input));
        in.close();
    }
};