package practice;

import java.util.Scanner;

public class CheckSubStringIsPalindrom{
    public boolean isPalindrom(String str){
        int start_index = 0;
        int end_index = str.length()-1;

        while(start_index < str.length()/2){
            if(str.charAt(start_index) != str.charAt(end_index)){
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }

    public void possibleSubString(String str){
        for(int start_index = 0; start_index < str.length(); start_index++){
            for(int end_index = start_index + 1; end_index <= str.length(); end_index++){
                String substring = str.substring(start_index, end_index);
                if(isPalindrom(substring)){
                    System.out.println(substring);
                }
            }
        }
    }

    public static void main(String[] args){
        CheckSubStringIsPalindrom object = new CheckSubStringIsPalindrom();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        object.possibleSubString(in.nextLine());
    }
};