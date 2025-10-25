/*
    Date: 11-03-2025
    Title: Boolean Datatype in Java.

    - The Boolean is a primitive datatype in java, represents a single bit information with two possible states: true or false.
    - It is used to store result of logical expressions or conditions.
    - Unlike other primitive datatypes like int or double, boolean does not have a specific size or range.
    - It is typically implemented as a single bit, although the exact implementation may vary across platform.
    - Syntax:
        boolean <variable-name> = value;
*/

// package declaration
package datatype;

// Definition of the class
public class BooleanDatatype{
    // Declaration of the boolean instance variable.
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    // boolean booleanVariable; // by default its value is "false".

    public static void main(String[] args){
        // Definition of the boolean datatype.
        boolean booleanVariable = false;    // default value is false.

        // printing the size of the boolean datatype
        System.out.println("Size of Boolean is 1 bit");
        // printing the default value of the boolean datatype.
        System.out.println("Default value of Boolean is " + booleanVariable);
    }
};

/*
output of program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . BooleanDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.BooleanDatatype
Size of Boolean is 1 bit
Default value of Boolean is false
*/