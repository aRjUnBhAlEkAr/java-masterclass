/*
    Date: 21-04-2025
    Title: Butterfly Structure.
*/

// package declaration
package pattern;

// Definition of class Butterfly
public class ButterFly{

    // Definition of main() method.
    public static void main(String[] args){
        System.out.println("\n*** Butterfly Pattern ***\n");
        int n = 8;
        // Outer loop definition
        for(int row = 1; row <= n; row++){
            // Inner loop definition for left side star print.
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            // Inner loop definition for space print
            for(int col = 1; col <= 2 * (n-row); col++){
                System.out.print("  ");
            }

            // Inner loop definition for right side star print.
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = n; row >= 1; row--){
            // Inner loop definition for left side star print.
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            // Inner loop definition for space print
            for(int col = 1; col <= 2 * (n-row); col++){
                System.out.print("  ");
            }

            // Inner loop definition for right side star print.
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
};