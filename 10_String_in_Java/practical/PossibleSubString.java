package practice;

import java.util.Scanner;

public class PossibleSubString{
    public void possibleSubString(String str){
        for(int start_index = 0; start_index < str.length(); start_index++){
            for(int end_index = start_index+1; end_index <= str.length(); end_index++){
                System.out.print(str.substring(start_index, end_index) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        PossibleSubString object = new PossibleSubString();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        object.possibleSubString(in.nextLine());
    }
};