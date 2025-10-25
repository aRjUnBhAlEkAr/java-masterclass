package practice;

import java.util.Scanner;

public class EvenNumber{
    Scanner in = null;

    public void acceptData(int array[]){
        in = new Scanner(System.in);
        System.out.println("Enter " + array.length + "integer values: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
        System.out.println("Data Accepted!");
        in.close();
    }

    public void printEvenElement(int array[]){
        System.out.println("Even Elements in array are: ");
        for(int index = 0; index < array.length; index++){
            if(array[index]%2==0){
                System.out.print(array[index] + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] array = new int[10];
        EvenNumber object = new EvenNumber();

        object.acceptData(array);
        object.printEvenElement(array);
    }
};