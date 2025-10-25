package practice;

import java.util.Scanner;

public class Practical_7{
    public void acceptData(short array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextShort();
        }
    }

    public void showData(Short array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        short array[] = new short[10];

        Practical_7 object = new Practical_7();
        object.acceptData(array);
        object.showData(array);
    }
};