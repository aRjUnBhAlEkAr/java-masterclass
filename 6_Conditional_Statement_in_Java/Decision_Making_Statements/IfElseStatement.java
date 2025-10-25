/*
    Date: 16-03-2025
    Title: if-else Decision statement in java. 
    - If-else statement is an extension to the if-statement, which uses another block of code i.e. else block.
    - The else block is executed if the condition of the if-block is evaluated as false.

    - Syntax:
        if(condition){
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
public class IfElseStatement{
    public static void main(String[] args){
        // Declaration of the variable.
        byte age = 20;

        // if-else block declaration
        if(age >= 18){
            // Executes when condition is true.
            System.out.println("Eligible to vote.");
        }
        else{
            // Executes when condition is false.
            System.out.println("Not eligible to vote.");
        }
    }
};