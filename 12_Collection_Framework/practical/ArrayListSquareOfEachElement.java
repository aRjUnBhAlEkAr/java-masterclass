// write a program to print square of each element.

package practice;

import java.util.ArrayList;

public class ArrayListSquareOfEachElement{
    public void squareOfEachElement(ArrayList arraylist){
        for(Object object : arraylist){
            System.out.println((Integer)object*(Integer)object);
        }
    }

    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);

        ArrayListSquareOfEachElement object = new ArrayListSquareOfEachElement();
        object.squareOfEachElement(arraylist);
    }
};