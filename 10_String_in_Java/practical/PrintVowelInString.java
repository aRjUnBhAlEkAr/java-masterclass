package practice;

import java.util.Scanner;

public class PrintVowelInString{
    public void printVowel(String str){
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == 'A' || str.charAt(index) == 'E' || str.charAt(index) == 'I' || str.charAt(index) == 'O' || str.charAt(index) == 'U' || str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u'){
                System.out.print(str.charAt(index) + " ");
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintVowelInString object = new PrintVowelInString();
        System.out.print("Enter a Sentece or Word: ");
        object.printVowel(in.nextLine());
    }
};