package practice;

import java.util.Scanner;

public class ToggleAlphabet{
    public void toggleAlphabet(String str){
        for(int index = 0; index < str.length(); index++){
            int ch = str.charAt(index);
            if(ch >= 97 && ch <= 122){
                System.out.print((char)(ch-32));
            }
            else if(ch >= 65 && ch <= 90){
                System.out.print((char)(ch+32));
            }
            else{
                System.out.print((char)ch);
            }
        }
    }
    
    public static void main(String[] args){
        ToggleAlphabet object = new ToggleAlphabet();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        object.toggleAlphabet(in.nextLine());
    }
};