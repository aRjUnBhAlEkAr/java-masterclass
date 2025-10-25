/*
    Date: 14-03-2025
    Title: Ternary Operator in Java
    - Ternary Operators in Java is used as one line replacement for if-else statement.
    - It is the only conditional operator which takes three operands. 
    - Syntax:
        <variable_name> = (condition) ?  Expression-1  :  Expression-2
        - if condition is true, then expression-1 executes.
        - if condition is false, then expression-2 executes.
    - If the condition is true then result of expression-1 will be assign to variable else result of expression-2 is assigned to variable. 
*/

// package declaration
package operators;

// definition of the class
public class TernaryOperator{
    public static void main(String[] args){
        // Declaration of variable
        byte num1, num2;
        num1 = 10;
        num2 = 0;
        System.out.println("Value at num1 is " + num1 + " and num2 is " + num2);

        // Ternary operation
        num2 = (num1 == 25) ? (byte)50 : (byte)120;
        
        System.out.println("Value at num1 is " + num1 + " and num2 is " + num2);

    } 
};