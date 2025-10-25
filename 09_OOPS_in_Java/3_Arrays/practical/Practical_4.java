package practice;

import java.util.Scanner;

public class Practical_4{
    public void acceptData(String array[]){
        Scanner in = new Scanner(System.in);

        int len = array.length;
        System.out.println("Enter " + len + " values: ");
        for(int index = 0; index < len; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.next();
        }
    }

    public void showData(String array[]){
        for(int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");
    }

    public static void main(String[] args){
        String array[] = new String[10];

        Practical_4 object = new Practical_4();
        object.acceptData(array);
        object.showData(array);
    }
};