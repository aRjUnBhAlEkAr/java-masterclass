package method;

import java.util.Scanner;

public class Practical_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        int input = in.nextInt();

        PrintCube.printCube(input);
    }
};