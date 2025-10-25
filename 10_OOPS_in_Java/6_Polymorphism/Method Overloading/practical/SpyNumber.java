package practice;

import java.util.Scanner;

public class SpyNumber{
    public boolean checkSpyNumber(int num){
        int sum = 0;
        int product = 1;
        int remain = 0;

        while(num != 0){
            remain = num % 10;
            sum+=remain;
            product*=remain;
            num/=10;
        }

        return (sum==product) ? true: false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SpyNumber object = new SpyNumber();

        System.out.print("Enter a value: ");
        int input = in.nextInt();

        boolean condition = object.checkSpyNumber(input);
        
        if(condition){
            System.out.println("It is a SPY number");
        }
        else{
            System.out.println("It is not a SPY number");
        }
    }
};