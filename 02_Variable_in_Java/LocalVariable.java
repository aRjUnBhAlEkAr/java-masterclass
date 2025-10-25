/* 
    Date: 11-03-2025
    Title: Local variable in java
    - A variable declared inside the body of method is called local variable.
    - You can only use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
    - syntax:
        <access_specifier> return_type function_name(parameters){
            datatype local_variable = value;
        }  
*/

// Declaration of the package.
package variable;

// Definition of the class
public class LocalVariable{
    public static void localVarMethod(){
    /*
        // Declaration of the local variable 
        int var;
        // Definition of the local variable
        var = 10;
    */

        // Definition of the local variable
        int var = 100;

        System.out.println("This is method of class \"localVarMethod\"");
        System.out.println("Value of local variable is " + var + "\n\n");
    }

    public static void main(String[] args){
        localVarMethod();

        // Definition of the local variable
        int var = 200;
        
        System.out.println("This is main() method");
        System.out.println("Value of local variable is " + var);
    }
};