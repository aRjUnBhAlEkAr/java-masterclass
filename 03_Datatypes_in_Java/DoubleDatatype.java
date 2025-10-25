/*
    Date: 12-03-2025
    Title: Double data type in Java.
    - It is declared with the "long" keyoword.
    - The double data type in Java is a primitive data type that represents double-precision 64-bit IEEE 754 floating-point numbers.
    - It default values is 0.0d.
    - It provides a wider range of values and greater precision compared to the float data type, making it suitable for applications where accurate representation of decimal values is required.
    - It can accurately represent values with up to approximately 15-16 significant decimal digits, making it suitable for application that required high precision, such as financial calculations, scientific computations, and graphics programming.
    - Syntax:
        // For the double instance variable.
        double <variable_name>;
                // OR
        double <variable_name> = value;

        // For the double local variable.
        double <variable_name> = value;
*/

// package declaration
package datatype;

// Definition of the class
public class DoubleDatatype{
    // Declaration of the double instance variable
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // double doubleVariable; // by default its value is "0.0d".

    public static void main(String[] args){
        // Declaration of the Double variable.
        // If we are declaring any local variable then we have to assign a value to that purticular variable otherwise it will throw an compile time error.
        double doubleVariable = 0.0d;

        // Printing the size of the double datatype.
        System.out.println("Size of double is " + Double.SIZE/8 + " byte");
        // Printing the range of the double datatype.
        System.out.println("Range starts from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        // Printing the default value of the double data type.
        System.out.println("Default value of double is " + doubleVariable);
    }
};

/*
Output of the Program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . DoubleDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.DoubleDatatype
Size of double is 8 byte
Range starts from 4.9E-324 to 1.7976931348623157E308
Default value of double is 0.0
*/