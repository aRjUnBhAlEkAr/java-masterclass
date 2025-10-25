// Custom exception by using throw and throws keyword.

package customexception;

import java.lang.Exception;
import java.util.Scanner;

class InvalidInputException extends Exception{
    public InvalidInputException(String msg){
        super(msg);
    }
};

public class CustomException{
    public static void main(String[] args) throws InvalidInputException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        if(in.nextInt() < 18){
            throw new InvalidInputException("Invalid Input value!");
        }
        else{
            System.out.println("Valid Input");
        }
    }
};