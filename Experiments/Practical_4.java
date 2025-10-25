package practical;

import java.util.Scanner;

public class Practical_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a[] = {10,69,55,20,60,30,0,10,20,30};
        int value = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    value = a[i];
                    a[i] = a[j];
                    a[j] = value;
                }
            }
        }

        System.out.println("Sorted array: ");
        for(int i : a){
            System.out.print(i + " ");
        }
    }
};