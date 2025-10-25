/*
    Date: 21-03-2025
    Title: Switch-Case Decision statement.
    - Switch-case Statement in Java
*/

// package declaration
package dms;

// Definition of "SwitchStatement" class.
public class SwitchStatement{
    public static void main(String[] args){
        // Declaration of the variable.
        int choice = 5;

        // Definition of Switch statement.
        switch(choice){
            case 1: System.out.println("case-1");
                    break;
            case 2: System.out.println("case-2");
                    break;
            case 3: System.out.println("case-3");
                    break;
            case 4: System.out.println("case-4");
                    break;
            case 5: System.out.println("case-5");
                    break;
            case 6: System.out.println("case-6");
                    break;
            default:
                    System.out.println("Invalid value.");
        }
    }
};