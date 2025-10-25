/*
    Date: 26-03-2025
    Title: Full Pyramid Structure.
*/

// package declaration
package pattern;

// Definition of the class
public class FullPyramid{
    // Definition of the main() method.
    public static void main(String[] args){
        // outer for-loop for the rows.
        int row_size = 10;
        int col_size = row_size*2-2;
        for(int row = 0; row < row_size; row++){
            // inner for-loop for th columns.
            for(int col = 0; col < col_size - 2*row; col++){
                System.out.print(" ");
            }

            for(int col = 0; col < 2*row+1; col++){
                System.out.print("* ");
            }
            // Following statement for new line.
            System.out.println();
        }
    }
};

/*
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *


          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * * 
*/