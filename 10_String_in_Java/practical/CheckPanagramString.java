package practice;

import java.util.Scanner;

public class CheckPanagramString{
    public String toLowerCase(String str){
        String string = "";

        for(int index=0; index < str.length(); index++){
            int ch = str.charAt(index);
            if(ch >= 65 && ch <= 90){
                string+=(char)(ch+32);
            }
            else{
                string+=(char)ch;
            }
        }
        // System.out.println(string);
        return string;
    }

    public String removeSpecialChar(String str){
        String string = "";
        str = toLowerCase(str);

        for(int index = 0; index < str.length(); index++){
            int ch = str.charAt(index);

            if(ch >= 97 && ch <= 122){
                string+=(char)ch;
            }
        }
        // System.out.println(string);
        return string;
    }

    public boolean containAllAlphabets(String str){
        String string = removeSpecialChar(str);
        int count = 0;
        for(int ascii_index = 97; ascii_index <= 122; ascii_index++){
            for(int str_index = 0; str_index < string.length(); str_index++){
                if(ascii_index == string.charAt(str_index)){
                    count++;
                    break;
                }
            }
        }
        return (count == 26)? true: false;
    }

    public boolean checkPanagram(String str){
        return (containAllAlphabets(str))?true: false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CheckPanagramString object = new CheckPanagramString();

        System.out.print("Enter a sentence: ");
        System.out.print("Given String is "+ ((object.checkPanagram(in.nextLine()))? "a" : "not" )+" Panagram String.");
    }
};



/**
 * Output:
    D:\TheKiranAcademy\3_String\practical>java practice.CheckPanagramString
    Enter a sentence: The quick brown fox jumps over lazy dog.
    Given String is a Panagram String.
 */