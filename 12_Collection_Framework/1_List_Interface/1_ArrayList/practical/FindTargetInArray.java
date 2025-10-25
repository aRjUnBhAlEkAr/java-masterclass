package practice;

import java.util.Scanner;

public class FindTargetInArray{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a target value: ");

        int a[] = {3,5,2,7,1,8};
        int target = in.nextInt();
        
        for(int start_index = 0; start_index < a.length; start_index++){
            for(int end_index = start_index+1; end_index < a.length; end_index++){
                if((a[start_index]+a[end_index]) == target){
                    System.out.println(a[start_index] + " and " + a[end_index]);
                    System.exit(0);
                }
            }
        }
    }
};