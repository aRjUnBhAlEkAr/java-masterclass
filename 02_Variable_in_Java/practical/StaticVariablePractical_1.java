/*
    Date: 11-03-2025
    Title: Write a program to print value of the static variable by using the two different object of class.
*/

// package declaration
package practice;

public class StaticVariablePractical_1{
    // Definition of the static variable.
    static int staticVar = 100;

    public static void main(String args[]){
        // Declaration of the object 1 
        StaticVariablePractical_1 object1 = new StaticVariablePractical_1();
        System.out.println("Value at the static variable of Object-1: " + object1.staticVar);

        // Declaration of the object 2
        StaticVariablePractical_1 object2 = new StaticVariablePractical_1();
        System.out.println("Value at the static variable of Object-2: " + object2.staticVar);
    }
};

/*
D:\Core-Java\2_Variable_in_Java\practical>javac -d . StaticVariablePractical_1.java
D:\Core-Java\2_Variable_in_Java\practical>java practice.StaticVariablePractical_1
Value at the static variable of Object-1: 100
Value at the static variable of Object-2: 100
*/