// Write a program to print sum of arraylist elements.

package practice;

import java.util.ArrayList;

public class ArrayListElementSum{
    public void arrayListSum(ArrayList arraylist){
        int sum = 0;
        for(Object object : arraylist){
            sum+=(Integer)object;
        }
        System.out.println("Sum of ArrayList element is " + sum);
    }
    
    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(150);
        arraylist.add(160);
        arraylist.add(170);
        arraylist.add(180);
        arraylist.add(190);

        ArrayListElementSum object = new ArrayListElementSum();
        object.arrayListSum(arraylist);
    }
};