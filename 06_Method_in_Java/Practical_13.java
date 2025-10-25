package method;

import java.util.Scanner;

public class Practical_13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Ente a value: ");
        int input = in.nextInt();

        ReverseNumber obj = new ReverseNumber();

        obj.reverseNumber(input);
    }
};