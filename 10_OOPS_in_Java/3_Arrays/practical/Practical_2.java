package practice;

import java.util.Scanner;

public class Practical_2{
    public void acceptData(long array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextLong();
        }
    }

    public void showData(long array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        long array[] = new long[10];

        Practical_2 object = new Practical_2();
        object.acceptData(array);
        object.showData(array);
    }
};