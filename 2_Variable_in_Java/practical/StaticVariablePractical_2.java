/*
    Date: 11-03-2025
    Title: Access the static variable by using object and class name.
*/

// package declaration
package practice;

// Definition of the class
public class StaticVariablePractical_2{
    static int staticVar;

    public static void main(String[] args){
        // Definition of the object of the class StaticVariablePractical_2
        StaticVariablePractical_2 svp = new StaticVariablePractical_2();
        // Definition of the static variable "staticVar" by using "svp" object.
        svp.staticVar = 150;
        // Accessing the value of the static variable by using the object.
        System.out.println("Value at the static variable is " + svp.staticVar);
                        
                        // OR

        // Initialization of the static variable "staticVar" by using the class name.
        StaticVariablePractical_2.staticVar = 250;

        // Accessing the value of the static variable by using the class name.
        System.out.println("Value at the static variable is " + StaticVariablePractical_2.staticVar);
    }
};

/*
Output of program:
D:\Core-Java\2_Variable_in_Java\practical>javac -d . StaticVariablePractical_2.java
D:\Core-Java\2_Variable_in_Java\practical>java practice.StaticVariablePractical_2
Value at the static variable is 150
Value at the static variable is 250
*/