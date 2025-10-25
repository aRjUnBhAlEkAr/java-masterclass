/*
    Date: 12-03-2025
    Title: Long Datatype in Java.
    - It is declared using the "long" keyword.
    - The long data type in Java is a primitive data type that represents a 64-bit signed two's complement integer.
    - It has a wider range of values than int, ranging from -9223372036854775808 to 9223372036854775807.
    - Its default value is 0.0l.
    - The long data types is used when int is not large enough ti hold the desired value, or when a larger range of integer values is needed.
    - The long datat type is commonly used in applications where large integer values are required, such as in scientific computations, financial applications and system programming.
    - Syntax: 
        // For the Long instance variable
        long <variable_name>;
                // OR
        long <variable_name> = value;

        // For the Long local variable.
        long <variable-name> = value;
*/

// Package declaration
package datatype;

// Definition of the class
public class LongDatatype{
    // Declaration of the long instance variable
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // static long longVariable; // by default its value is "0".

    public static void main(String[] args){
        // Declaration of the long variable.
        // If we are declaring any local variable then we have to assign a value to that purticular variable otherwise it will throw an compile time error.
        long longVariable = 0l;
        
        // Printing the size of the long datatype.
        System.out.println("Size of the long is " + Long.SIZE/8 + " byte ");
        // Printing the Range of the long datatype.
        System.out.println("Range starts from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        // Printing the default value of the long datatype.
        System.out.println("Default value of long is " + longVariable);
                    // OR
        // System.out.println("Default value of long is " + LongDatatype.longVariable);
    }
};

/*
output of the program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . LongDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.LongDatatype
Size of the long is 8 byte
Range starts from -9223372036854775808 to 9223372036854775807
Default value of long is 0
*/