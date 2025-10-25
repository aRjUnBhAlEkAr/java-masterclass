package practice;

import java.util.Scanner;

public class RemoveSpecialChar{
    public void replaceSpecialChar(String str){
        String string = "";
        for(int index = 0; index < str.length(); index++){
            int ch = str.codePointAt(index);

            if((ch >= 65 && ch <=90) || (ch>=97 && ch<=122) || ch == 32){
                string = string + (char)ch;
            }
        }
        System.out.println("After removing special char: " + string);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        RemoveSpecialChar object = new RemoveSpecialChar();

        System.out.print("Enter a sentence or word: ");
        String str = in.nextLine();
        object.replaceSpecialChar(str);
    }
};