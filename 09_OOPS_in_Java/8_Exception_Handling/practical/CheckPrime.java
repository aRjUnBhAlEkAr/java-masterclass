package practice;

import java.util.Scanner;

public class CheckPrime{

    public void checkPrime(int input){
        int count = 0;
        for(int num = 1; num <= input; num++){
            if(input%num==0){
                count++;
            }
        }

        if(count == 2){
            System.out.println(input + " is prime number");
        }
        else{
            System.out.println(input + " is not prime number");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CheckPrime object = new CheckPrime();
        System.out.print("Enter a number: ");
        object.checkPrime(in.nextInt());
    }
};