/*
    Date: 11-03-2025
    Title: Instance variable in the Java
    - Instance variable are non-static variables and declared in a class and outside of any method, constructor or block.
                        // OR
    - The variable declared inside any class and outside the body of the method, is called as "Instance Variable".
    - It is called instance variable because its value is instance specific and is not shared among instances.
    - An Instance variables are declared in a class, these variable are created when an object of the class is created and destroyed when the object is destroyed.
    - Unlike the local variable, we may use access specifier for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
    - The scope of the instance variable are throughout the class except the static contexts.
    - Instance variable can be accessed by only creating objects.
    - Syntax:
        <access_specifier> return_type class_name{
            <access_specifier> datatype instance_variable;
                            // OR
            <access_specifier> datatype instance_variable = value;
        };
*/

// Declaration of the package
package variable;

// Definition of the Class
public class InstanceVariable{
    // Private instance variable which is only accessible in the class.
    private int instanceVarRoll;
    // Default instance variable which is only accessible in the package.
    String instanceVarName;
    // Public instance variable which is accessible anywhere.
    public float instanceVarMarks;
    
    {
        instanceVarRoll = 10;
        instanceVarName = "Arjun";
        instanceVarMarks = 85.47f;
    }

    public static void main(String[] args){
        InstanceVariable iv = new InstanceVariable();

        System.out.println("Roll number is " + iv.instanceVarRoll);
        System.out.println("Name is " + iv.instanceVarName);
        System.out.println("Marks are " + iv.instanceVarMarks);
    }
};