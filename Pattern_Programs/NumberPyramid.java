/*
    Date: 21-04-2025
    Title: Number Pattern
*/

// Package declaration
package pattern;

// Definition of class
public class NumberPyramid{
    // Definition of the main() method.
    public static void main(String[] args){
        System.out.println("\n *** Number Pyramid ***\n");

        int n = 5;

        // Outer for loop definition
        for(int row = 1; row <= n; row++){
            // Inner for loop definition
            for(int col = 1; col <= n; col++){
                if(col > n-row){
                    System.out.print(row + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
};