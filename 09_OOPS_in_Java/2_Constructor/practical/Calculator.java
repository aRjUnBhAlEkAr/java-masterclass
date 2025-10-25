package practice;

import java.util.Scanner;

public class Calculator{
    static int num1;
    static int num2;
    static Scanner in = new Scanner(System.in);

    private int addition(int num1, int num2){
        return num1+num2;
    }

    private int substraction(int num1, int num2){
        return num1-num2;
    }

    private int multiplication(int num1, int num2){
        return num1*num2;
    }

    private double division(int num1, int num2){
        return num1/num2;
    }

    private int modularDivision(int num1, int num2){
        return num1%num2;
    }

    private static void setValues(){
        System.out.print("Enter 1st value: ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd value: ");
        num2 = in.nextInt();

        in.close();
    }

    public static void main(String[] args){
        Calculator obj = new Calculator();



        System.out.print("1 - Addition\n2 - Substraction\n3 - Multiplication\n4 - Division\n5 - Modular Division\n6 - Exit\nEnter your choice: ");
        int choice = in.nextInt();

        switch(choice){
            case 1: setValues();
                    System.out.println("Addition is " + obj.addition(num1, num2));
                    break;
            case 2: setValues();
                    System.out.println("Substraction is " + obj.substraction(num1, num2));
                    break;
            case 3: setValues();
                    System.out.println("Multiplication is " + obj.multiplication(num1, num2));
                    break;
            case 4: setValues();
                    System.out.println("Division is " + obj.division(num1, num2));
                    break;
            case 5: setValues();
                    System.out.println("Modular Division is " + obj.modularDivision(num1, num2));
                    break;
            case 6: System.exit(0);
            default:
                    System.out.println("Invalid Entry!");
        }
    }
};