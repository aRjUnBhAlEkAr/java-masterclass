package practice;

import java.util.Scanner;

public class PrintOccuranceOfChar{
    public void printOccuranceOfChar(String str){
        String string = str.toLowerCase();
        String update_String = "";

        for(int o_index = 0; o_index < str.length(); o_index++){
            char ch = string.charAt(o_index);
            int count = 0;
            for(int i_index = 0; i_index < string.length() && !update_String.contains(ch + ""); i_index++){
                if(ch == string.charAt(i_index)){
                    count++;
                }
            }
            if(!update_String.contains(ch + "")){
                System.out.println(str.charAt(o_index) + " : " + count);
            }
            update_String+=ch;
        }
        
        
        // str = str.toLowerCase();
        // int array[] = new int[256];

        // for(int index = 0; index < str.length(); index++){
        //     char ch = str.charAt(index);
        //     array[ch]++;
        // }

        // for(int index = 0; index < str.length(); index++){
        //     char ch = str.charAt(index);
        //     System.out.println(array[ch]);
        //     array[ch] = 0;
        // }

        /** LOGIC-3 */
        // String string = str.toLowerCase();

        // for(int o_index = 0; o_index < str.length(); o_index++){
        //     char ch = string.charAt(o_index);
        //     int count = 0;
        //     for(int i_index = 0; i_index < string.length(); i_index++){
        //         if(ch == string.charAt(i_index)){
        //             count++;
        //         }
        //     }
        //     System.out.println(str.charAt(o_index) + " : " + count);
        // }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        PrintOccuranceOfChar object = new PrintOccuranceOfChar();
        System.out.print("Enter a sentence: ");
        object.printOccuranceOfChar(in.nextLine());
    }
};