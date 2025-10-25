package practice;

import java.util.Scanner;

public class CapitalizeEachWord{
    public String capitalizedEachWord(String str){
        String[] string = str.split(" ");
        String capatalizedString = "";
        // for(String s: string){
        //     System.out.println(s);
        // }
        for(int index=0; index < string.length; index++){
            for(int str_index = 0; str_index < string[index].length(); str_index++){
                int ch = string[index].charAt(str_index);
                if((ch >= 97 && ch <= 122) && str_index == 0){
                    capatalizedString+=(char)(ch-32);
                }
                else{
                    capatalizedString+=(char)ch;
                }
            }
            capatalizedString+=" ";
        }
        return capatalizedString;
    }

    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        CapitalizeEachWord object = new CapitalizeEachWord();

        System.out.print("Enter a sentence: ");
        String string = in.nextLine();
        System.out.println("String: " + object.capitalizedEachWord(string));
    }
};

/**
 * Output:
    D:\TheKiranAcademy\3_String\practical>java practice.CapitalizeEachWord
    Enter a sentence: the quick brown fox jumps over lazy dog.
    String: The Quick Brown Fox Jumps Over Lazy Dog.
 */