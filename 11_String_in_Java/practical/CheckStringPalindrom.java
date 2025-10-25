package practice;

import java.util.Scanner;

public class CheckStringPalindrom{
    public String removeSpace(String str){
        String string = "";

        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == ' '){
                string = string + "";
            }
            else{
                string = string + str.charAt(index);
            }
        }
        return string;
    }

    public String removeSpecialChar(String str){
        String string = "";

        for(int index = 0; index < str.length(); index++){
            int ascii_value = (int)str.charAt(index);
            if((ascii_value >= 97 && ascii_value <= 122) || (ascii_value >= 65 && ascii_value <= 90)){
                string = string + str.charAt(index);
            }
        }
        return string;
    }

    public String toLowerCase(String str){
        String string = "";

        for(int index = 0; index < str.length(); index++){
            int ascii_value = str.charAt(index);
            if(ascii_value >= 65 && ascii_value <= 90){
                string = string + (char)(ascii_value+32);
            }
            else{
                string = string + str.charAt(index);
            }
        }
        
        return string;
    }

    public boolean isPalindrom(String str){
        int start = 0, end = str.length() - 1;

        while(start < str.length()/2){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        CheckStringPalindrom object = new CheckStringPalindrom();
        System.out.print("Enter a sentence: ");
        String string = in.nextLine();
        string = object.toLowerCase(string);
        System.out.println("To Lower Case: " + string);
        string = object.removeSpace(string);
        System.out.println("After removing space: " + string);
        string = object.removeSpecialChar(string);
        System.out.println("After removing spacial character: " + string);

        System.out.println("String is Palindrom: " + object.isPalindrom(string));
    }
};