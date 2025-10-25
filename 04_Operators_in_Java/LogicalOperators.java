/*
    Date: 14-03-2025
    Title: Logical Operators in Java
    - Logical Operators in java is used to perform logical operations like logical AND and logical OR.
    - There are three logical operators in Java.
        1. Logical AND  (&&)
        - Logical AND operator return true when both condition are true, otherwise it returns false.
        2. Logical OR   (||)    
        - Logical OR operator return true when one of condition is true.
        - If both condition is false, then return false.
        3. Logical NOT  (!)
        - Logical NOT is a unary operator in Java.
        - Logical NOT operation returns true when operands value is false, and vice-versa.
*/

// package declaration
package operators;

// definition of the class
public class LogicalOperators{
    public static void main(String[] args){
        // Declaration of the boolean variable.
        boolean True = true;
        boolean False = false;

        // Logical AND operation
        System.out.println("Logical AND ( && ) Operation: ");
        System.out.println(True + " && " + True + "\t" + (True && True));

        System.out.println(True + " && " + False + "\t" + (True && False));

        System.out.println(False + " && " + True + "\t" + (False && True));

        System.out.println(False + " && " + False + "\t" + (False && False));

        // Logical OR operation
        System.out.println("\nLogical OR ( || ) Operation: ");
        System.out.println(True + " || " + True + "\t" + (True || True));

        System.out.println(True + " || " + False + "\t" + (True || False));

        System.out.println(False + " || " + True + "\t" + (False || True));

        System.out.println(False + " || " + False + "\t" + (False || False));

        // Logical NOT operation
        System.out.println("\nLogical NOT ( ! ) Operation:");
        System.out.println("!(" + True + ") \t" + !(True));
        
        System.out.println("!(" + False + ")\t" + !(False));
    }
};