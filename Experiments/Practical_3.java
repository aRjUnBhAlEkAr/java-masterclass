package practical;

import java.util.Scanner;

public class Practical_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a[] = new int[10];

        System.out.println("Enter " + a.length + " values: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(i+1 + " : ");
            a[i] = in.nextInt();
        }

        int max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum value in array is " + max);
    }
};