package practice;

import java.util.Scanner;

public class CountSpace{
    public void countSpace(String str){
        int count = 0;
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == ' '){
                count++;
            }
        }

        System.out.println("Count of Space: " + count);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CountSpace object = new CountSpace();
        System.out.print("Enter a sentence or word: ");
        object.countSpace(in.nextLine());      
    }
};