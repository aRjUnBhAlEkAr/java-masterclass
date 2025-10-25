package method;

import java.util.Scanner;

public class Practical_9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MenuDriven obj = new MenuDriven();

        System.out.print("Press 1 - Addition\nPress 2 - Substraction\nPress 3 - Multiplication\nPress 4 - Division\nPress 5 - Modular Division\nEnter your choice: ");
        int choice = in.nextInt();
        
        System.out.print("Enter num1 value: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 value: ");
        int num2 = in.nextInt();

        switch(choice){
            case 1: obj.addition(num1, num2);
                    break;
            case 2: obj.substraction(num1, num2);
                    break;
            case 3: obj.multiplication(num1, num2);
                    break;
            case 4: obj.division(num1, num2);
                    break;
            case 5: obj.modularDivision(num1, num2);
                    break;
            default: System.out.println("Invalid entry!");
        }
    }
};