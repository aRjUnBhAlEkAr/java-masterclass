/*
    Date: 21-04-2025
    Title: Hollow Rectangle pattern.
*/

// package declaration
package pattern;

// Definition of class
public class HollowRectangle{
    // Definition of the main() method.
    public static void main(String[] args){
        System.out.println("\n *** Hollow Rectangle Pattern *** \n");
        int n = 8;
        // Outer loop definition
        for(int row = 0; row < n; row++){
            // Inner loop definition
            for(int col = 0; col < n*2; col++){
                // Condition for printing pattern.
                if(row == 0 || col == 0 || row == n-1 || col == (n*2-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
};