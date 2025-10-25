/*
    Date: 11-03-2025
    Title: Write a program to count number of the object created of the same class.
*/

// package declaration
package practice;

// Definition of the class
public class StaticVariablePractical_3{
    // Declaration of the static variable.
    static int count;

    // Definition of method increment()
    public void increment(){
        count++;
    }

    public static void main(String[] args){
        // Declaration of the object-1 of the class StaticVariablePractical_3
        StaticVariablePractical_3 object1 = new StaticVariablePractical_3();
        // Declaration of the object-2 of the class StaticVariablePractical_3
        StaticVariablePractical_3 object2 = new StaticVariablePractical_3();

        object1.increment();
        object2.increment();

        System.out.println("Value of the static variable at object-1 is " + object1.count);
        System.out.println("Vaule of the static variable at object-2 is " + object2.count);
    }
};

/*
output of the program:
D:\Core-Java\2_Variable_in_Java\practical>javac -d . StaticVariablePractical_3.java
D:\Core-Java\2_Variable_in_Java\practical>java practice.StaticVariablePractical_3
Value of the static variable at object-1 is 2
Vaule of the static variable at object-2 is 2
*/