/*
    Date: 14-03-2025
    Title: Shift operators in Java
    - Shift operators works on the bits of the data.
    - It shifts the bits of the number from left to right or right to left.
    - There are three types of shift operators in Java:
        1. Left Shift Operator(signed):
        - The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.
        - Syntax:
            operand << <shift-value>
        2. Right Shift operator (signed)
        - The Java Right shift operator >> is used to shirt all of the bits in a value to the right side.
        - Syntax:
            operand >> <shift-value>
        3. Unsigned Right shift operator >>>
        - Shifts bits right, filling 0s, with the leftmost bit always 0.
        - Syntax:
            operand >>> <shift-value>
*/

// package declaration
package operators;

// definition of the class
public class ShiftOperators{
    public static void main(String[] args){
        // Declaration of variables
        int num1 = 10;

        // Left Shift operator
        System.out.println("Left Shift operator:\t" + (num1 << 1));

        // Right Shift operator
        System.out.println("Right Shift operator:\t" + (num1 >> 1));

        // Unsigned right shift operator
        System.out.println("Unsigned Right Shift Operator:\t" + (num1 >>> 2));
    }
};