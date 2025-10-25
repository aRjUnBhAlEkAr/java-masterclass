/*
    Date: 21-04-2025
    Title: Palindrom Pyramid Pattern.
*/

// package declaration
package pattern;

// Definition of the class
public class PalindromPyramid{
    // Definition of the main() method.
    public static void main(String[] args){
        System.out.println("\n--- Palindrom Pyramid Pattern ---\n");
        // outer for-loop for the rows.
        int row_size = 8;
        int col_size = row_size*2-2;
        for(int row = 0; row < row_size; row++){
            int count = 65+row;
            int flag = 0;
            // inner for-loop for th columns.
            for(int col = 0; col < col_size - 2*row; col++){
                System.out.print(" ");
            }

            for(int col = 0; col < 2*row+1; col++){
                System.out.print((char)count + " ");
                if(count > 65 && flag == 0){
                    count--;   
                }
                else{
                    count++;
                    flag = 1;
                }
            }
            // Following statement for new line.
            System.out.println();
        }
    }
};