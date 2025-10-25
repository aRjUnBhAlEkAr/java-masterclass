/*
    Date: 17-03-2025
    Title: Nested-if Decision statement.
    - In Nested-If statement, the if statement can contain a if or if-ekse statement inside another if or else-if statement.
    - Syntax:
        if(condition){
            // Executes when condition is true.

            // if-else statement inside the outer if block.
            if(condition){
                // Executes when condition is true.
            }
            else{
                // Executes when conditio is false.
            }
        }
        else{
            // Executes when condition is true.
            
            // if conditional statement inside else block of outer if block.
            if(condition){
                // Executes when condition is true.
            }
        }
*/

// package declaration
package dms;

// definition of the class
public class NestedIfStatement{
    public static void main(String[] args){
        // Declaration of the variables.
        int num1 = 13;
        int num2 = 46;
        int num3 = 82;

        // Declaration of the nested-if statement.
        if(num1 > num2){
            // Executes when condition is true.
            if(num1 > num2){
                System.out.println("Num-1 is Greater.");
            }
            else{
                System.out.println("Num-2 is Greater.");
            }
        }
        else{
            // Executes when condition is false.
            if(num2 > num3){
                System.out.println("Num-2 is Greater");
            }
            else{
                System.out.println("Num-3 is Greater");
            }
        }
    }
};