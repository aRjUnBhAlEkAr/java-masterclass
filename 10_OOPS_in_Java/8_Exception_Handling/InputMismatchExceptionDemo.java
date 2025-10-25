package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = 0;
        try{
            System.out.print("Enter a value: ");
            a = in.nextInt();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("Catch block");
        }
    }
};