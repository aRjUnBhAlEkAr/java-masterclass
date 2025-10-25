/*
    Date: 13-03-2025
    Title: Arithmetic Operator in Java
    - In Java, Arithmetic Operators are used to perform the operation like Addition, Substraction, Division, Multiplication and Division, etc.
    - Arithmetic Operators are as follow:
        1. Addition         : +
        2. Substraction     : -
        3. Multiplication   : * (asterisk)
        4. Division         : /
        5. Modular Division : % (Modulus)
    - Example:
        variable = operand operator operand
        addition =    10      +       20
*/

// Package declaration
package operators;

// Definition of the class.
public class ArithmeticOperators{
    public static void main(String[] args){
        // Declaration of the Operand variable
        byte num1 = 60;
        byte num2 = 30;

        // Performing the addition operation.
        System.out.println("Addition of " + num1 + " + " + num2 + " is " + (num1+num2));

        // Performing the substraction operation.
        System.out.println("Substraction of " + num1 + " - " + num2 + " is " + (num1+num2));

        // Performing the multiplication operation.
        System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + (num1*num2));

        // Performing the Division Operation.
        System.out.println("Division of " + num1 + " / " + num2 + " is " + (num1/num2));

        // Performing the Modulus or Modular division.
        System.out.println("Modular division of " + num1 + " % " + num2 + " is " + (num1%num2));
    }
};