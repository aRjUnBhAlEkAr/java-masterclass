/*
    Date: 11-03-2025
    Title: Integer Datatype in the Java.
    - It is declared using the keyword "int".
    - The integer datatype is a Primitive datatype that represents a 32-bit signed two's complement integer.
    - It has a range of values from -2,147,483,648 to 2,147,483,648 (-2^32/2 to 2^32/2-1).
    - The int data type is one of the most commonly used data types in Java and typically used to store whole numbers without decimal points.
    - Its default value is 0.
    - Syntax:
        // For the instance variable
        int <variable_name>;
                // OR
        int <variable_name> = value;

        // For the local variable
        int <variable_name> = value;
*/

// package declaration
package datatype;

// Definition of the class
public class IntegerDatatype{
    // Declaration of the int instance variable.
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // int integerVariable; // by default its value is "0".

    public static void main(String[] args){
        // Declaration of the Integer variable.
        // If we are declaring any local variable then we have to assign a value to that purticular variable otherwise it will throw an compile time error.
        int integerVariable = 0;

        // Printing the size of the integer datatype.
        System.out.println("Size of the integer is " + Integer.SIZE/8 + " byte");
        // Printing the range of the integer datatype.
        System.out.println("Range starts from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        // Printing the default value of the integer datatype.
        System.out.println("Default value of integer is " + integerVariable);
    }
};

/*
Output of the program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . IntegerDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.IntegerDatatype
Size of the integer is 4 byte
Range starts from -2147483648 to 2147483647
Default value of integer is 0
*/