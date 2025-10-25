package mdarray;

import java.util.Scanner;

public class MDOperations{
    Scanner in = null;

    public void acceptData(int[][] array){
        in = new Scanner(System.in);

        System.out.println("*** Accepting Elements ***");
        for(int index=0; index < array.length; index++){
            for(int ptr=0; ptr < array[0].length; ptr++){
                System.out.print("array[" + index + "][" + ptr + "] " + " : ");
                array[index][ptr] = in.nextInt();            
            }
        }    
    }

    public void showData(int[][] array){
        System.out.println("*** Showing Elements ***");

        for(int index=0; index < array.length; index++){
            for(int ptr=0; ptr < array[0].length; ptr++){
                System.out.print("\t" + array[index][ptr]);
            }
            System.out.println();
        }
    }

    public void multiplication(int[][] num1, int[][] num2, int[][] array){
        for(int index=0; index < array.length; index++){
            for(int ptr=0; ptr < array[0].length; ptr++){
                for(int x = 0; x < array.length; x++){
                    array[index][ptr] += num1[index][x] * num2[x][index];
                }
            }
        }
    }

    public static void main(String[] args){
        int result[][] = new int[3][3];
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];

        MDOperations object = new MDOperations();
        System.out.println("Matrix-1 input: ");
        object.acceptData(num1);
        System.out.println("Matrix-2 input: ");
        object.acceptData(num2);
        System.out.println("Showing Matrix-1 Elements: ");
        object.showData(num1);
        System.out.println("Showing Matrix-2 Elements: ");
        object.showData(num2);

        System.out.println("Matrix Multiplications: ");
        object.multiplication(num1, num2, result);
        object.showData(result);
    }
};