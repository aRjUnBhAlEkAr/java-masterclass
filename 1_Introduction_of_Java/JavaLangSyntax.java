/*      Practical-1
    Date: 10-03-2025
    Title: Basic Syntax of the Java Program.
    Current version of Java: java version "17.0.11" 2024-04-16 LTS 
*/

// Package: Package is the collection of class-file, enum, sub-packages and libraries.
package introduction;   // declaration of the package where we can store the class files of following code.

// Declaration of the java class using "class" keyword.
// In java language we can give only the public and Default access modifier to the class Private and Protected is not allowed as an access modifier to class. 
public class JavaLangSyntax{
    
    // declaration of the main() method using "static" keyword so we don't have to create an object of the class to run main() method.
    public static void main(String[] args){
    /* 
    public  - "public" keyword is an access modifier in java that represents the visibility.
            - It is visible to all i.e Anyone can access from anywhere.
    static  - "static" is a keyword in java. If we declare any method as static, it is know as "static method".
            - The Core Advantages of the static method is that there is no need to create an object to invoke the static method.
            - The main() method is executed by the JVM(Java Virtual Machine), so it doesn't require creating an object to invoke the main() method. So, it saves method. 
    void    - "void" is an return type of the method and it means it doesn't return any value.
    main()  - "main()" method represents the starting point of the program. 
    */
        // Output statement in the java.
        System.out.println("Welcome to Java Language");
        /*
        System   - "System" is an class.
        out      - "out" is an object of the PrintStream class.
        println()- "println()" is a method of PrintStream class.
        String[] args - "String[] args" is used for command line arguments.
        */    
    }
};  // semicolor ";" is optional in Java language.