package practice;

import java.util.Scanner;

public class CheckWordInStringPalindrom{
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
    
    public void printPalindromWord(String str){
        String string[] = str.split("\\s+");
        
        for(String word: string){
            if(isPalindrom(word.toLowerCase())){
                System.out.print(word + " ");
            }
        }
    }
    
    public static void main(String[] args){
        CheckWordInStringPalindrom object = new CheckWordInStringPalindrom();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        object.printPalindromWord(in.nextLine());
    }
};