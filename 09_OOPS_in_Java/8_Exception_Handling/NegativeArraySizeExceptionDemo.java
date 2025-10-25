package exception;

import java.util.Scanner;

public class NegativeArraySizeExceptionDemo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int array[];
        try{
            System.out.print("Enter size of array: ");
            int size = in.nextInt();
            array = new int[size];   
        }
        catch(NegativeArraySizeException e){
            e.printStackTrace();
        }
    }
};