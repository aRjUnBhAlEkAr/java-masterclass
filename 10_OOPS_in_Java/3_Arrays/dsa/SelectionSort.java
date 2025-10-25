package dsa;

import java.util.Scanner;

public class SelectionSort{
    Scanner in = null;

    public void acceptData(int[] array){
        in = new Scanner(System.in);

        System.out.println(" *** Accepting Elements *** ");
        for(int index = 0; index < array.length; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
        System.out.println("Element inserted!");
        // closing resources.
        in.close();    
    }

    public void showData(int[] array){
        System.out.println(" *** Displaying Elements *** ");
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }

    public void swap(int[] array, int first_index, int second_index){
        int temp = array[first_index];
        array[first_index] = array[second_index];
        array[second_index] = temp;
    }

    public void selectionSort(int[] array){
        int min_index;

        for(int index = 0; index < array.length-1; index++){
            min_index = index;
            System.out.println("\nMin Element " + array[min_index]);
            for(int ptr = index+1; ptr < array.length; ptr++){
                if(array[ptr] < array[min_index]){
                    min_index = ptr;
                }
            }

            swap(array, index, min_index);
        }
    }
};