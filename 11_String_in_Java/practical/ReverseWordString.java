package practice;

import java.util.Scanner;

public class ReverseWordString{
    public String reverseWordString(String str){
        String[] string = str.split(" ");
        String reverse_string = "";
        for(int index = string.length - 1; index >= 0; index--){
            reverse_string = reverse_string + " " + string[index];
        }
        return reverse_string;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ReverseWordString object = new ReverseWordString();
        System.out.print("Enter a sentence: ");
        String string = in.nextLine();
        System.out.println("Reverse word String: " + object.reverseWordString(string));
    }
};

/**
 * Output:
    D:\TheKiranAcademy\3_String\practical>java practice.ReverseWordString
    Enter a sentence: The quick brown fox jumps over lazy dog.
    Reverse word String:  dog. lazy over jumps fox brown quick The
*/