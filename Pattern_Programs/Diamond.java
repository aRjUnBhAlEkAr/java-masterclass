/*
    Date: 21-04-2025
    Title: Diamond Pattern.
*/

// Declaration of Package
package pattern;

// Definition of class
public class Diamond{
    // Definition of the main() method.
    public static void main(String[] args){
        System.out.println("\n--- Diamond Pattern ---\n");
        int n = 4;
        int flag = 1;
        // Outer for loop declaration
        for(int row = 1; row <= n*2; row++){
            // Inner for loop declaration
            if(row <= 4){
                for(int col = 1; col <= n-row; col++){
                    System.out.print("  ");
                }
            }
            else{
                for(int col = flag; col >= 1; col--){
                    System.out.print("  ");
                }
            }
            
            // Inner for loop declaration
            if(row <= 4){
                for(int col = 1; col <= 2 * row - 1; col++){
                    System.out.print("* ");
                }
            }
            else{
                for(int col = 1; col <= 2 * (n-flag) - 1; col++){
                    System.out.print("* ");
                }
                flag++;
            }

            System.out.println();
        }
    }
};