/*
    Date: 13-05-2025
    Title: Unary Operators in Java
    - The Unary Operators in Java requires only one operand.
    - Unary operators are used to perform various operations i.e. incrementing/decrementing a value by one, negating an expression and inverting teh value of a boolean.
    - Following is the list of unary operators:
        1. Unary Minus  (-).
        - The Unary Minus Operators changes the sign of the operand.
        - The operator is used on numbers, it changes the positive number to negative number and vice-verse.
        2. Increment:   (++)
        - Increment operator increments a value by 1.
        - Following are two types of increment operator:
            a. Pre-Increment.   (++<variable>)
            - First increments a value by one, then use the value.
            - for example: ++var;
            b. Post-Increment.  (<variable>++)
            - First uses the value, then increments a value by one.
            - for example: var++;
        3. Decrement:   (--)
        - Decrement operator decrements a value by 1.
        - Following are two types of decrement operators.
            a. Pre-Decrement.   (--<variable>)
            - First decrements a value by one, then uses the value.
            - For example: --var;
            b. Post-Decrement.  (<variable>--)
            - First uses the value, then decrements a value by one.
        4. Not (!)
        - Not is used to negates the expression.
*/

// package declaration
package operators;

// definition of the class
public class UnaryOperators{
    public static void main(String[] args){
        // Declaration of the variable for unary minus operation.
        byte num = 10;

        // Declaration of the increment variable.
        byte incre = 1;

        // Declaration of the decrement variable.
        byte decre = 1;

        // Declaration of the boolean variable for the Not operator.
        boolean bool = false;

        // Unary Minus operation.
        System.out.println("Unary Minus Operation: " + -num);

        // Unary Pre-increment operation.
        System.out.println("\nBefore Pre-Increment Operation value is " + incre);
        System.out.println("Unary Pre-Increment Operation: " + ++incre);
        System.out.println("After Pre-Increment Operation values is " + incre);

        // Unary Post-increment operation.
        System.out.println("\nBefore Post-Increment Operation value is " + incre);
        System.out.println("Unary Post-Increment Operation: " + incre++);
        System.out.println("After Post-Increment Operation values is " + incre);
    
        // Unary Pre-decrement operation
        System.out.println("\nBefore Pre-Decrement Operation value is " + decre);
        System.out.println("Unary Pre-Decrement Operation: "+ --decre);
        System.out.println("After Pre-Decrement Operation value is " + decre);

        // Unary Post-decrement operation
        System.out.println("\nBefore Post-Decrement Operation value is " + decre);
        System.out.println("Unary Post-Decrement Operation: " + decre--);
        System.out.println("After Post-Decrement Operation value is " + decre);
    }
};