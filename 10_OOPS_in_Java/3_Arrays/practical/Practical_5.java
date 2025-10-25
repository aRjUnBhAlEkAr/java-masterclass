package practice;

import java.util.Scanner;

public class Practical_5{
    public void acceptData(double array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextDouble();
        }
    }

    public void showData(double array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        double array[] = new double[10];

        Practical_5 object = new Practical_5();
        object.acceptData(array);
        object.showData(array);
    }
};