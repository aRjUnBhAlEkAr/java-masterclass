// Write a program to products of arraylist elements.

package practice;

import java.util.ArrayList;

public class ArrayListElementProduct{
    public void arrayListProduct(ArrayList arraylist){
        int product = 1;
        for(Object object : arraylist){
            product*=(Integer)object;
        }
        System.out.println("Product of ArrayList element is " + product);
    }
    
    public static void main(String[] args){
        ArrayList arraylist = new ArrayList();
        arraylist.add(150);
        arraylist.add(160);
        arraylist.add(170);
        arraylist.add(180);
        arraylist.add(190);

        ArrayListElementProduct object = new ArrayListElementProduct();
        object.arrayListProduct(arraylist);
    }
};