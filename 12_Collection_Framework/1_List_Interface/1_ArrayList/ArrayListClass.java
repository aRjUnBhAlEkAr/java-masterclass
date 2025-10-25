/**
 * Date: 05-05-2025
 * Title: ArrayList Collection Framework in Java.
 * - ArrayList is a collection of heterogenius data or values.
 * - Following are the methods of ArrayList.
 *  a. public int size()        - returns size of ArrayList
 *  b. public boolean isEmpty() - return boolean values if ArrayList is empty returns true otherwise false. 
 *  c. public boolean add(E e)  - Appends the specified element to the end of this list.
 *  d. public void add(int index, E element)
 *                              - Insert the specified element at the specified position in this list.
 *                              - Shifts the element currently at that position and any subsequent elements to the right.
 *  e. public boolean addAll(E e) -  
 */

package arraylist;

import java.util.ArrayList;

public class ArrayListClass{
    public static void main(String[] args){
        // Non-Generic collection.
        ArrayList list = new ArrayList();
        
        // Add operation on ArrayList
        System.out.println(" *** Add Operation : add(object) ***");
        list.add("Arjun");
        list.add(123);
        list.add("Mango");
        list.add(true);
        list.add("Black");
        list.add("Mango");
        list.add("Lotus");
        list.add(null);
        list.add("Lotus");
        System.out.println("Array List: " + list + "\n");

        // Add opeteration at specific index on ArrayList.
        System.out.println(" *** Add operation on Specific index: add(index, object)");
        list.add(1, "Bhalekar");
        System.out.println("Array List: " +     list+ "\n");

        // Add All oepration on ArrayList
        System.out.println(" *** Add All operation : addAll(ArrayList object)");
        ArrayList temp = new ArrayList();
        temp.add("Kiran");
        temp.add("Karan");
        temp.addAll(list);
        System.out.println("Array List: " + temp + "\n");

        // Remove operation on ArrayList
        System.out.println(" *** Remove Operation : remove(object)");
        list.remove("Mango");
        System.out.println("Array List :" + list + "\n");

        // Remove All operation on ArrayList
        System.out.println(" *** Remove All Operation : removeAll(Collection object)");
        temp.removeAll(list);
        System.out.println("Array List :" + temp + "\n");

        // Retain operation on ArrayList
        System.out.println(" *** Retain Operation : retain(Collection object)");
        temp.add("Arjun");
        temp.add("Bhalekar");
        temp.retainAll(list);
        System.out.print("Array List: " + temp + "\n");
    
        
    }
};