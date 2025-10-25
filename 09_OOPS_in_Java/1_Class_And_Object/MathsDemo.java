// package declaration
package cao;

import java.util.Scanner;

public class MathsDemo{
    public static void main(String[] args){
        // creating the object of the Scanner class.
        Scanner in = new Scanner(System.in);
        
        // Declaration of the object of class Maths.
        Maths obj = new Maths();

        // Declaration of the input variable.
        System.out.print("Enter first value: ");
        int num1 = in.nextInt();

        System.out.print("Enter second value: ");
        int num2 = in.nextInt();

        // calling the add() method.
        System.out.println("Addition is + " + obj.add(num1, num2));

        // calling the sub() method.
        System.out.println("Substraction is " + obj.sub(num1, num2));

        // calling the mul() method.
        System.out.println("Multiplication is " + obj.mul(num1, num2));

        // calling the div() method.
        System.out.println("Division is " + obj.div(num1, num2));

        // calling the mod() method.
        System.out.println("Modular division is " + obj.mod(num1, num2));
    }
};