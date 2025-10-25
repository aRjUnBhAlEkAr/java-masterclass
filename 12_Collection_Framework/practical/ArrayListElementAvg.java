// Write a program to print average of arraylist elements.

package practice;

import java.util.ArrayList;

public class ArrayListElementAvg{
    public void arrayListAvg(ArrayList arraylist){
        int sum = 0;
        for(Object object : arraylist){
            sum+=(Integer)object;
        }
        System.out.println("Average of ArrayList element is " + sum/arraylist.size());
    }
    
    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(150);
        arraylist.add(160);
        arraylist.add(170);
        arraylist.add(180);
        arraylist.add(190);

        ArrayListElementAvg object = new ArrayListElementAvg();
        object.arrayListAvg(arraylist);
    }
};