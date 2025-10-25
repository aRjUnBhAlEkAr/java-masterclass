/*
    Date: 14-03-2025
    Title: Relational Operators in Java
    - Relational Operators in Java is used to specify the relationship between two operands.
                // OR
    - Relational Operators in Java is used to check the relationship between two operands.
    - These operators return boolean values either true or false.
    - Following is the list of relational operators:
        1. Equals to. ( == )
        - Checks weather two operands are equals or not.
        2. Less than. ( < )
        - Checks weather left-hand side operand is less than right-hand side operand.
        - If it is, then it returns true else it returns false.
        3. Less than equals to. ( <= ) 
        - Checks weather left-hand side operand is less then or equals to right-hand side operand.
        - If it is, then it returns true else it returns false.
        4. Greater than. ( >= )
        - Checks weather left-hand side operand is greater than righ-hand operand.
        - If it is, then it returns true else it returns false.
        5. Greater than equals to.
        - Checks weather left-hand side operand is greater than or equals to right-hand operand.
        - If it is, then it returns true else it returns false.
        6. Not equals to.
        - Checks weather left-hand side operand is Not equals to right-hand operand.
        - If it is, then it returns true else it returns false. 
*/

// package declaration
package operators;

// Definition of the class
public class RelationalOperators{
    public static void main(String[] args){
        // Declaration of the two boolean variable
        boolean var1 = true;
        boolean var2 = false;

        byte num1 = 10;
        byte num2 = 20;

        System.out.println("Operator\tOperation\tResult");
        // Equals to operation
        System.out.println("Equals to :\t" + var1 + " == " + var2 + "\t" + (var1 == var2));
    
        // Less than operation
        System.out.println("Less than :\t" + num1 + " < " + num2 + "\t\t" + (num1<num2));

        // Less than or Equals to operation
        System.out.println("Less than \nor Equals to :\t" + num1 + " <= " + num2 + "\t" + (num1<=num2));

        // Greater than operation
        System.out.println("Greater than :\t" + num1 + " > " + num2 + "\t\t" + (num1>num2));

        //Greater than or equals to operation
        System.out.println("Greater than \nor Equals to :\t" + num2 + " >= " + num1 + "\t" + (num2 >= num1));

        // Not Equals to operation
        System.out.println("Not Equals to :\t" + num1 + " != " + num2 + "\t" + (num1 != num2));
    }
};