/*
    Date: 12-03-2025
    Title: Character data type in Java.
    - It is declared using the "char" keyword.
    - The character data type in java is a primitive data type that represents a single 16-bit Unicode character.
    - The size of the character datatype is 2 byte.
    - Its range starts from 0 to 65,535.
    - It is because Java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system.
    - It can store any character from the Unicode character set, that allows Java to support internationalization and representation of characters from various languages and writing system.
    - It is commonly used to represent characters such as letter, digits, and symbols.
    - It can also be used to perform arithmetic operations, as the Unicode values of characters can be treated as integers.
    - Value of the character must be between single coutes('')
      For example:
        char var = 'A';
    - Syntax:
        // For the Character instance variable.
        char <variable_name>;
                // OR
        char <variable_name> = 'value';

        // For the Character local variable.
        char <variable_name> = 'value';
*/

// package declaration
package datatype;

// Definition of the class
public class CharDatatype{
    // Declaration of the character instance variable
    // For the instance variable, it is optional to define(assign) value to the instance variable.
    static char charVariable; // by default its value is "0.0d".

    public static void main(String[] args){
        // Declaration of the Character variable.
        // If we are declaring any local variable then we have to assign a value to that purticular variable otherwise it will throw an compile time error.
        char charVariable = 'A';

        // Printing the size of the character data type.
        System.out.println("Size of the char is " + Character.SIZE/8 + " byte");
        // Printing the Range of the character data type.
        System.out.println("Range starts from " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        // Printing the Default value of the Character data type.
        System.out.println("Default value of char is " + CharDatatype.charVariable);
        // Initialized value of Character variable
        System.out.println("Initilized value of local char variable is " + charVariable);
    }
};

/*
Output of the Program:
D:\Core-Java\3_Datatypes_in_Java>javac -d . CharDatatype.java
D:\Core-Java\3_Datatypes_in_Java>java datatype.CharDatatype
Size of the char is 2 byte
Range starts from 0 to 65535
Default value of char is
Initilized value of local char variable is A
*/