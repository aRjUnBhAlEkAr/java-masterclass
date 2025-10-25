/*
    Date: 12-03-2025
    Title: Assignment operators in Java
    - Assignment operators in Java is used to store or assign value to the variable.
    - It is used to assign the value on its right to operand on its right.
    - Following are the Assignment Operators in Java.
        1. Equal        : =
            variable = value;
        2. Plus Equal to   : +=
            variable += value;  // variable = variable + value;
        3. Minus Equal to  : -=
            variable -= value;  // variable = variable - value;
        4. Multiplication Equal to : *=
            variable *= value;  // variable = variable * value;
        5. Division Equal to : /=
            variable /= value;  // variable = variable / value;
        6. Modulus Equal to: %=
            variable %= value;  // variable = variable % value;
*/

// package declaration.
package operators;

// Definition of the class
public class AssignmentOperators{
    public static void main(String[] args){
        // Declaration of the two integer variable
        int num = 10;

        // Performing the addition operation using Plus Equals to operator.
        int sum = num;
        System.out.println(sum + " += " + num + " is " + (sum+=num)); // sum = sum + num1

        // Performing the substraction operation using Minus Equals to operator.
        int sub = num;
        System.out.println(sub + " -= " + num + " is " + (sub-=num)); // sub = sub - num1

        // Performing the multiplication operation using the Multiplication Equals to operator.
        int mul = num;
        System.out.println(mul + " *= " + num + " is " + (mul*=num)); // mul = mul * num1

        // Performing the division operation using the Division Equals to operator.
        int div = num;
        System.out.println(div + " /= " + num + " is " + (div/=num)); // div = div / num1

        // Performing the Modular Division Operation using the Modulas Equals to operator.
        int mod = num;
        System.out.println(mod + " %= " + num + " is " + (mod%=num));
    }
};