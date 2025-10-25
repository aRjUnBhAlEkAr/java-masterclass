package practice;

import java.util.Scanner;

public class StringToLowerCase{
    public String toLowerCase(String str){
        String lowerString = "";
        for(int index = 0; index < str.length(); index++){
            int c = str.codePointAt(index);
            if(c >= 65 && c <= 90){
                lowerString = lowerString + (char)(c + 32);
            }
            else{
                lowerString = lowerString + (char)(c);
            }
        }
        return lowerString;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringToLowerCase object = new StringToLowerCase();

        System.out.print("Enter a sentence or word: ");
        String str = object.toLowerCase(in.nextLine());
        System.out.print("lower case: " + str);
    }
};