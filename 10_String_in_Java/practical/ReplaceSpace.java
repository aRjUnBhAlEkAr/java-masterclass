package practice;

import java.util.Scanner;

public class ReplaceSpace{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence or Word: ");
        String str = in.nextLine();
        str.replace(" ", "");
        System.out.println("After removing space: " + str);
    }
}