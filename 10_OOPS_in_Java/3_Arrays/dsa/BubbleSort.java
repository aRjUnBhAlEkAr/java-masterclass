package dsa;

import java.util.Scanner;

public class BubbleSort{
    Scanner in = null;

    public void acceptData(int array[]){
        in = new Scanner(System.in);

        System.out.println(" *** Acception Elements *** ");
        System.out.println("Enter " + array.length + " integer values: ");
        for(int index = 0; index < array.length; index++){
            System.out.print(index+1 + " : ");
            array[index] = in.nextInt();
        }
        System.out.println("Elements accepted!");
        in.close();
    }

    public void showData(int array[]){
        System.out.println(" *** Displaying Elements *** ");
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }

    public void bubbleSort(int array[]){
        int temp_element = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp_element = array[i];
                    array[i] = array[j];
                    array[j] = temp_element;
                }
            }
        }
    }
};