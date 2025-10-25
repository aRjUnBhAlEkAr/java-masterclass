/*
    Date: 21-04-2025
    Title: Rectangle pattern.
*/

// package declaration
package pattern;

// definition of class
public class Rectangle{
    // Definition of the main() method.
    public static void main(String[] args){
        System.out.println("\n*** Rectangle Pattern ***\n");
        // Outer loop definition
        for(int row = 0; row < 5; row++){
            // Inner loop definition
            for(int col=0; col < 5*2; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
};