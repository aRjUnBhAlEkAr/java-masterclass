/*
    Date: 16-03-2025
    Title: If-Else-If Decision statement in Java.
    - The If-Else-If statement contains the if-statement followed by multiple else-if statements.
    - In other words, we can say that it is the chain of if-else statements that create a decision true where the program may enter in the block of code where the condition is true.
    - We can also define an else statement at the end of the chain.
    - Syntax:
        if(condition-1){
            // Executes when condition is true.
            // code to be executed.
        }
        else if(condition-2){
            // Executes when condition is true.
            // code to be executed.
        }
        .
        .
        .
        else if(condition-n){
            // Executes when condition is true.
            // code to be executed.
        }
        else{
            // Executes when condition is false.
            // code to be executed.
        }
*/

// package declaration
package dms;

// Definition of the class
public class IfElseIfLadder{
    public static void main(String[] args){
        // Declaration of the variable
        byte marks = 85;

        // If-else-if ladder
        if(marks >= 75){
            System.out.println("A - Grade");
        }
        else if(marks >= 65 && marks < 75){
            System.out.println("B - Grade");
        }
        else if(marks >= 55 && marks < 65){
            System.out.println("C - Grade");
        }
        else if(marks >= 45 && marks < 55){
            System.out.println("D - Grade");
        }
        else if(marks >= 35 && marks < 45){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
};