package practice;

import java.util.Scanner;

public class CheckAnagramString{

    public String toLowerCase(String str){
        String string = "";

        for(int index = 0; index < str.length(); index++){
            int ch = str.charAt(index);

            if(ch >= 65 && ch <= 90){
                string+=(char)(ch+32);
            }
            else{
                string+=(char)ch;
            }
        }
        return string;
    }

    public String removeSpecialChar(String str){
        String string = "";
        str = removeSpecialChar(str);
        for(int index = 0; index < str.length(); index++){
            int ch = str.charAt(index);
            
            if((ch >= 97 && ch <= 122)){
                string+=(char)ch;
            }
        }

        return string;
    }

    public String rearrangeString(String str){
        String string = "";
        String ra_String = removeSpecialChar(str);

        for(int ascii_index = 97; ascii_index <= 122; ascii_index++){
            
            for(int str_index = 0; str_index < ra_String.length(); str_index++){
                if(ascii_index == ra_String.charAt(str_index)){
                    string+=(char)ascii_index;
                }
            }
        }
        // System.out.println(string);
        return string;
    }

    public boolean isAnagram(String string1, String string2){
       if(rearrangeString(string1).equals(rearrangeString(string2))){
        return true;
       }

       return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CheckAnagramString object = new CheckAnagramString();
        System.out.print("Enter first sentece: ");
        String string1 = in.nextLine();
        System.out.print("Enter second sentece: ");
        String string2 = in.nextLine();

        System.out.println("Given strings are Anagram: " + object.isAnagram(string1, string2));
        // System.out.println("To Lower case: " + object.toLowerCase(string));
        // System.out.println("Remove Special character: " + object.removeSpecialChar(string));
        // System.out.println("Rearrange String: " + object.rearrangeString(string));
    }
};