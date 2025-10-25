/*
    Date: 26-03-2025
    Title: Right Half Pyramid
*/


// Declaration of the package
package pattern;

// Definition of the class
public class RightHalfPyramid{
    // Definition of the main() method.
    public static void main(String[] args){
        // outer for-loop for the rows.
        for(int row = 0; row < 5; row++){
            // inner for-loop for the columns.
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            
            // Following statement for the new line.
            System.out.println();
        }
    }
};