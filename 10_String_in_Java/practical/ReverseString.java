package practice;

import java.util.Scanner;

public class ReverseString{
    public String reverseString(String str){
        String reverseString = "";

        for(int index = 0; index < str.length(); index++){
            reverseString = str.charAt(index) + reverseString;
        }

        return reverseString;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ReverseString object = new ReverseString();
        System.out.print("Enter a sentence or word: ");
        String s = in.nextLine();
        System.out.print("Reverse String: " + object.reverseString(s));
    }
};