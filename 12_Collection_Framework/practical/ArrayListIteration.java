// write a program to print arraylist elements using for each loop.

package practice;

import java.util.ArrayList;

public class ArrayListIteration{
    public void iterateArrayList(ArrayList arraylist){
        System.out.println("Iterating ArrayList using for each loop...");
        for(Object object : arraylist){
            System.out.print(object + "\t");
        }   
    }
    
    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add("Kri$na");
        arraylist.add("Arjun");
        arraylist.add(108);
        arraylist.add(7.77777);

        ArrayListIteration object = new ArrayListIteration();
        object.iterateArrayList(arraylist);
    }
};