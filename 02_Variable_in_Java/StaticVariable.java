/*
    Date: 11-03-2025
    Title: Static variable in Java.
    - Static variable declared similarly to the instance variable. The difference is that static variables are declared using the static keyword within class outside of any method, constructor or block.
                or
    - A variable that declared as static is called a static variable.
    - It cannot be local.
    - We can create an a single copy of the static variable and share among all the instance of the class.
    - Memory allocation for static variables happens only once when the class is loaded in the memory.
    - Static variables are created at the start of execution and destroyed automatically when execution ends.
    - Initialization of the static variable is not mendatory. Its default value is dependent on the data type of variable.
    - Static block can be used to initialize static variable.
    - Syntax:
        <access_specifier> class <class-name>{
            static datatype variable_name;
        }
*/

// package declaration
package variable;

// Definition of the Class
public class StaticVariable{
    // Declaration of the static variable.
    static int staticVar = 100;

    // We can initialize static variable by using static block.
    static{
        staticVar = 500;
    }
    public static void main(String[] args){
        // 1. Accessing the static variable by using the object of the class.
        StaticVariable sv = new StaticVariable();
        System.out.println("Accessing static variable by using object: " + staticVar);
                            // OR
        // 2. Accessing the static variable by using the class name.
        StaticVariable.staticVar = 150;
        System.out.println("Accessing static variable by using Class name: " + StaticVariable.staticVar);

        // 3. We can directly access the static variable by its variable name as shown below.
        staticVar = 200;
        System.out.println("Directly accessing static variable by using variable name: " + staticVar);
    }
};

/*
Output of the program:
D:\Core-Java\2_Variable_in_Java>javac -d . StaticVariable.java
D:\Core-Java\2_Variable_in_Java>java variable.StaticVariable
Accessing static variable by using object: 500
Accessing static variable by using Class name: 150
Directly accessing static variable by using variable name: 200
*/