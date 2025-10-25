package method;

public class MenuDriven{
    public void addition(int num1, int num2){
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1+num2));
    }
    
    public void substraction(int num1, int num2){
        System.out.println("Substraction of " + num1 + " and " + num2 + " is " + (num1-num2));
    }

    
    public void multiplication(int num1, int num2){
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
    }
    
    public void division(int num1, int num2){
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1/num2));
    }
    
    public void modularDivision(int num1, int num2){
        System.out.println("Modular Division of " + num1 + " and " + num2 + " is " + (num1%num2));
    }
};