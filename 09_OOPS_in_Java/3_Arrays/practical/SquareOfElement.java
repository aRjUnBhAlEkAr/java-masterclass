package practice;

import java.util.Scanner;

public class SquareOfElement{
    Scanner in = null;
    
    public void acceptData(int array[]){
        in = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integer values: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
        System.out.println("Data accepted!");
    }

    public void printSquareOfElement(int array[]){
        System.out.println("Square of Elements are: ");
        int element = 0;
        for(int index = 0; index < array.length; index++){
            element = array[index];
            System.out.println(element + " : " + element*element);
        }
    }
    
    public static void main(String[] args){
        SquareOfElement object = new SquareOfElement();
        int []array = new int[5];
        
        object.acceptData(array);
        object.printSquareOfElement(array);
    }
};