// Write a program to print highest element of arraylist

package practice;

import java.util.ArrayList;

public class ArrayListHighestElement{
    public void printHighestElement(ArrayList arraylist){
        int max_element = 0;
        int element = 0;
        for(Object object : arraylist){
            element = (Integer)object;
            if(element > max_element){
                max_element = element;
            }
        }
        System.out.println("Highest element of arraylist is " + max_element);
    }

    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(150);
        arraylist.add(160);
        arraylist.add(1000);
        arraylist.add(170);
        arraylist.add(180);
        arraylist.add(190);

        ArrayListHighestElement object = new ArrayListHighestElement();
        object.printHighestElement(arraylist);
    }
};