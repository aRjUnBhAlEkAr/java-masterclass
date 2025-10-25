package method;

import java.util.Scanner;

public class Practical_11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrimeNumber obj = new PrimeNumber();

        System.out.print("Enter a value: ");
        int input = in.nextInt();

        obj.checkPrimeOrNot(input);
    }
};