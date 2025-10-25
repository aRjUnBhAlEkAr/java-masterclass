package practice;

import java.util.Scanner;

public class TwistedPrime{
    public void checkTwistedPrime(int num){
        int remain = 0;
        int result = 0;
        while(num != 0){
            remain = num%10;
            result = result * 10 + remain;
            num/=10;
        }
        System.out.println("Result is " + result);

        int count = 0;
        for(int i = 2; i <= result; i++){
            if(result%i == 0){
                count++;
            }
        }

        if(count == 1){
            System.out.println("Number is Twisted Prime number.");
        }
        else{
            System.out.println("Number is not twisted prime number.");
        }
    }

    
    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        TwistedPrime obj = new TwistedPrime();

        System.out.print("Enter a value: ");
        int num = in.nextInt();
        obj.checkTwistedPrime(num);
    }
};