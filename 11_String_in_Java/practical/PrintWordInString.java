package practice;

import java.util.Scanner;

public class PrintWordInString{
    public void printWord(String str){
        str = str.trim();
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) != 32){
                System.out.print(str.charAt(index));
            }  
            else if(str.charAt(index+1) != 32){
                System.out.println("");
            } 
        }
    }

    public static void main(String[] args){
        PrintWordInString object = new PrintWordInString();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        object.printWord(in.nextLine());
    }
};