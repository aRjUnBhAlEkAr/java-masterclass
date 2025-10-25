package practice;

import java.util.Scanner;

public class ToggleCaseWord{
    public String toggleCaseWord(String str){
        String[] string = str.split(" ");
        String toggleWord = "";

        for(int index = 0; index < string.length; index++){
            for(int str_index = 0; str_index < string[index].length(); str_index++){
                int ch = string[index].charAt(str_index);
                if((ch >= 65 && ch <= 90) && str_index == 0){
                    toggleWord+=(char)(ch+32);
                }
                else if((ch >= 97 && ch <= 122) && str_index != 0){
                    toggleWord+=(char)(ch-32);
                }
                else{
                    toggleWord+=(char)ch;
                }
            }
            toggleWord+=" ";
        }
        return toggleWord;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ToggleCaseWord object = new ToggleCaseWord();
        System.out.print("Enter a sentence: ");
        String string = in.nextLine();

        System.out.println("Toggle Case String: " + object.toggleCaseWord(string));
    }
};


/**
 * Output:
    D:\TheKiranAcademy\3_String\practical>java practice.ToggleCaseWord
    Enter a sentence: the quick brown fox jumps over lazy dog.
    Toggle Case String: tHE qUICK bROWN fOX jUMPS oVER lAZY dOG.
 */