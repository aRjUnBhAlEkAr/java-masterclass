/*
    Date: 14-03-2024
    Title: Bitwise operators in Java
    - Bitwise operators in Java is used to perform the bit-level operation.
    - 
    - This operators is used when performing update and query operations of the binary indexed trees.
    - Following is the list of Bitwise operators:
        1. Bitwise AND (&)
        - It performs the AND operation on the operands.
        2. Bitwise OR (|)
        - It performs the OR operation on the operands.
        3. Bitwise XOR (^)
        - It performs the XOR operation on the operands.
        4. Bitwise Complement(~)
        - It is an unary operator in java which inverts the bits pattern.
*/

// package declaration
package operators;

// definition of the class
public class BitwiseOperators{
    public static void main(String[] args){
        // Declaration of the variables
        int num1 = 1;   // 00000001
        int num2 = 2;   // 00000010

        // Bitwise AND operation
        System.out.println("Bitwise AND:\n" + num1 + " & " + num2 + " = " + (num1&num2));

        // Bitwise OR operation
        System.out.println("Bitwise OR:\n" + num1 + " | " + num2 + " = " + (num1|num2));

        // Bitwise XOR operation
        System.out.println("Bitwise XOR:\n" + num1 + " ^ " + num2 + " = " + (num1^num2));

        // Bitwise Complement Operation
        System.out.println("Bitwise Complement:\n" + "~(" + num1 + ") = " + ~(num1));
    }
};