package method;

import java.util.Scanner;

public class Practical_12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int input = in.nextInt();

        Palindrom obj = new Palindrom();
        obj.checkPalindrom(input);
        
    }
};