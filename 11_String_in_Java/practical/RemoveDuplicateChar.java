package practice;

import java.util.Scanner;

public class RemoveDuplicateChar{
    public String removeDuplicateChar(String str){
        String update_string = "";
        String temp_string = "";
        String string = str.toLowerCase();
        for(int index = 0; index < str.length(); index++){
            if(!temp_string.contains(string.charAt(index) + "")){
                update_string+=str.charAt(index);
                temp_string+=string.charAt(index);
            }
        }

        return update_string;
    }

    public static void main(String[] args){
        RemoveDuplicateChar object = new RemoveDuplicateChar();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = in.nextLine();
        System.out.print("After removing duplicate char: " + object.removeDuplicateChar(string));
    }
};