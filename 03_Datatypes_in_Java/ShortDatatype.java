/*
    Date: 11-03-2025
    Title: Short Datatype in Java.
    - It is declared using the "short" keyword.
    - The Short Datatype in Java is primitive datatype that represents a 16-bit signed two's complement integer.
    - It has a range from -32,768 to 32,767 (-2^16/2 to 2^16/2-1).
    - It is used when the memory conservation is a concern, but more precious than byte is required.
    - Its default value is 0;
    - Syntax:
        short <data_type> <variable_name>;

*/

// package declaration 
package datatype;

// Definition of the class
public class ShortDatatype{
    // Declaration of the short instance variable.
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // int shortVariable; // by default its value is "0".

    public static void main(String[] args){
        // Declaration of the short datatype.
        short shortVariable = 0;    // default value is 0.

        // Priniting the size of the short datatype.
        System.out.println("Size of Short is " + Short.SIZE/8 + " byte");
        // Printing the range of the short datatype.
        System.out.println("Range starts from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        // Printing the default value of the short datatype.
        System.out.println("Default value of short is " + shortVariable);
    }
};

/*
D:\Core-Java\3_Datatypes_in_Java>javac -d . ShortDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.ShortDatatype
Size of Short is 2 byte
Range starts from -32768 to 32767
Default value of short is 0
*/