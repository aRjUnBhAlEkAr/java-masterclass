// Write a program to print arraylist element using iterator.

package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration_2{
    public void iterateArrayList(ArrayList arraylist){
        System.out.println("Iterating ArrayList using Iterator interface...");

        Iterator iterator = arraylist.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
    
    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add("Kri$na");
        arraylist.add("Arjun");
        arraylist.add(108);
        arraylist.add(7.77777);

        ArrayListIteration_2 object = new ArrayListIteration_2();
        object.iterateArrayList(arraylist);
    }
};