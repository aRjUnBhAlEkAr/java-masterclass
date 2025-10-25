// Write a program to print lowest element of arraylist

package practice;

import java.util.ArrayList;

public class ArrayListLowestElement{
    public void printLowestElement(ArrayList arraylist){
        int min_element = (Integer)arraylist.get(0);
        int element = 0;
        for(Object object : arraylist){
            element = (Integer)object;
            if(element < min_element){
                min_element = element;
            }
        }
        System.out.println("Lowest element of arraylist is " + min_element);
    }

    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(150);
        arraylist.add(160);
        arraylist.add(1000);
        arraylist.add(170);
        arraylist.add(180);
        arraylist.add(190);
        arraylist.add(101);

        ArrayListLowestElement object = new ArrayListLowestElement();
        object.printLowestElement(arraylist);
    }
};