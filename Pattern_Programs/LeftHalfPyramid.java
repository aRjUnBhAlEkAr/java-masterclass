/*
    Date: 26-03-2025
    Title: Left Half Pyramid
*/

// Package Declaration
package pattern;

// Definition of the class
public class LeftHalfPyramid{
    // Definition of the main() method.
    public static void main(String[] args){
        // outer for-loop for the rows.
        int row_size = 10;
        for(int row = 0; row < row_size; row++){
            // inner for-loop for the colums.
            for(int col = row_size; col >= 0; col--){
                // if the value of variable 'col' is less than or euals to row, then it will print '* ' otherwise it will print "  ".
                if(col <= row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            // Following statement for the new line.
            System.out.println();
        }
    }
};