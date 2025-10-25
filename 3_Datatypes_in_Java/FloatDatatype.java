/*
    Date: 12-03-2025
    Title: Float datatype in Java.
    - It is declared using the keyword "float".
    - The float data type in Java is a primitive data type that represents single-precision 32-bit IEEE 754 floating-point numbers.
    - It can represent a wide range of decimal values, but it is not suitable for precise values such as currency.
    - The flaot data type is useful for applications where a higher range of values is needed, and precision is not critical.
    - It is sufficient for holding 6 to 7 decimal digit.
    - Syntax:
        // For the float instance variable.
        float <variable-name>;
            or
        float <variable_name> = value;

        // For float local variable.
        float <variable_name> = value;
*/

// package declaration
package datatype;

// Definition of the class
public class FloatDatatype{
    // Declaration of the float instance variable.
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    static float floatVariable; // by default its value is "0.0f".
    
    public static void main(String[] args){
        // Declaration of the Float variable.
        // If we are declaring any local variable then we have to assign a value to that purticular variable otherwise it will throw an compile time error.
        float floatVariable = 0.0f; // by default any decimal value in java is considered as double so we have to narrow it by using the 0.0f for float datatype.

        // Printing the size of float datatype.
        System.out.println("Size of the Float is " + Float.SIZE/8 + " byte.");
        // Printing the Range of the float datatype.
        System.out.println("Range start from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        // Printing the default value of the float datatype.
        System.out.println("Default value of float is " + floatVariable);
        // System.out.println("Default value of float is " + FloatDatatype.floatVariable);
    }
};

/*
Output of the Program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . FloatDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.FloatDatatype
Size of the Float is 4 byte.
Range start from 1.4E-45 to 3.4028235E38
Default value of float is 0.0
*/