/*
    Date: 12-03-2025
    Title: Write a program to print all Unicode values.
*/

// package declaration
package practice;

// Definition of the class
public class CharPractical_1{
    public static void main(String[] args){
        // Storing the minimum size of the character datatype.
        int minCharSize = (int)Character.MIN_VALUE;

        // Storing the maximum size of the character datatype.
        int maxCharSize = (int)Character.MAX_VALUE;

        for(int i = minCharSize; i <= 150; i++){
            System.out.println(i + " : " + (char) i);
        }
    }
};