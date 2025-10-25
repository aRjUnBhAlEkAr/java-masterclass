package practice;

import java.util.Scanner;

public class Practical_3{
    public void acceptData(float array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextFloat();
        }
    }

    public void showData(float array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        float array[] = new float[10];

        Practical_3 object = new Practical_3();
        object.acceptData(array);
        object.showData(array);
    }
};