package method;

import java.util.Scanner;

public class Practical_10{
    public static void main(String[] args){
        EvenOrNot obj = new EvenOrNot();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int input = in.nextInt();

        obj.checkEvenOrNot(input);
    }
};