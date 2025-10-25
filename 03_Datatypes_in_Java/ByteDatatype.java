/*
    Date: 11-03-2025
    Title: Byte Datatype in Java.
    - It is declared using the "byte" keyword.
    - The Byte data type in java is primitive data type that represents 8-bit signed two's complement integer.
    - It has a range of value from -128 to 127 (-2^8/2 to 2^8/2-1).
    - Its default value is 0.
    - The byte datatype is commonly used when working with raw binary date or when memory conservation is a concern, as it occupies less memory than integer like int or long.
    - Syntax:
        byte <variable_name> = value;
*/

// package declaration.
package datatype;

// Definition of the class
public class ByteDatatype{
    // Declaration of the byte instance variable.
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // byte byteVariable; // by default its value is "0".

    public static void main(String[] args){
        // Definition of byte variable.
        byte byteVariable = 0;  // Default value is 0.

        // Printing the size of the byte datatype.
        System.out.println("Size of Byte is " + Byte.SIZE/8 + " byte");
        // Printing the range of the byte datatype.
        System.out.println("Range starts from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        // Printing the default of the byte datatype.
        System.out.println("Default value of byte variable is " + byteVariable);
    }
};

/*
output of program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . ByteDatatype.java

D:\Core-Java\3_Datatypes_in_Java>java datatype.ByteDatatype
Size of Byte is 1 byte
Range starts from -128 to 127
Default value of byte variable is 0
*/