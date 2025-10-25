package dsa;

import java.util.Scanner;

public class MergeSort{
    Scanner in = null;

    public void acceptData(int[] array){
        in = new Scanner(System.in);

        System.out.println(" *** Accepting Elements *** ");
        System.out.println("Enter " + array.length + " integer values: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
    }

    public void showData(int[] array){
        System.out.println(" *** Displaying Elements *** ");
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }

    public void mergeSort(int[] array){

    }
};