/*
    Date: 21-04-2025
    Title: Binary Triangle Pattern. 
*/

// package declaration
package pattern;

// Definition of Class
public class BinaryTriangle{
    // Definition of the main() method
    public static void main(String[] args){
        System.out.println("\n *** Binary Triangle Pattern ***");
        int n = 8;
        // Outer loop definition.
        for(int row = 0; row < n; row++){
            // Inner loop definition
            for(int col = 0; col < row; col++){
                if((row + col)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
};