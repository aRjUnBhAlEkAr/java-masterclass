package method;

import java.util.Scanner;

public class Practical_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Declaration of the input variable
        System.out.print("Enter a value: ");
        int input = in.nextInt();

        DivisibleByNumbers obj = new DivisibleByNumbers();
        obj.checkDivisible(input);
    }
};