/*
    Date: 16-03-2025
    Title: If Decision statement in Java.
    - If-Statement in used to evaluate a condition.
    - The control of program is diverted depending upon the specific condition.
    - The condition of the If-Statement gives a Boolean value, either true or false.
    - Syntax:
        if(condition){
            // Executes when condition is true.
            // code to be execute.
        }
*/

// package declaration
package dms;

// Definition of the class
public class IfStatement{
    public static void main(String[] args){
        // Declaration of the variable
        byte age = 18;

        // If-statement declaration.
        if(age >= 18){
            // Executes when condition is true.
            System.out.println("Eligible to vote");
        }
    }
};