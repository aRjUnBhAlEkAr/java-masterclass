package practice;

import java.util.Scanner;

public class Practical_1{
    public void acceptData(int array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
    }

    public void showData(int array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        int array[] = new int[10];

        Practical_1 object = new Practical_1();
        object.acceptData(array);
        object.showData(array);
    }
};