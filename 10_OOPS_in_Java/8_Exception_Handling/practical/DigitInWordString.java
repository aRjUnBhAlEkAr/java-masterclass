package practice;

import java.util.Scanner;

public class DigitInWordString{
    public void seperateDigit(String digit){
        for(int index = 0; index < digit.length(); index++){
            System.out.print(printWord(digit.charAt(index)) + " ");
        }
    }

    public String printWord(char digit){
        switch(digit){
            case '1': return "One";
            case '2': return "Two";
            case '3': return "Three";
            case '4': return "Four";
            case '5': return "Five";
            case '6': return "Six";
            case '7': return "Seven";
            case '8': return "Eight";
            case '9': return "Nine";
            case '0': return "Zero";
            default: return null;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DigitInWordString object = new DigitInWordString();
        System.out.print("Enter a number: ");
        object.seperateDigit(in.next());
    }
}