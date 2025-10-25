// Package declaration
package linkedlist;

// Importing necessary packages and class.
import java.util.LinkedList;
import java.util.List;


// Definition of LinkedListClass class.
public class LinkedListClass{
    // Definition of the main() method.
    public static void main(String[] args){
        // Creating object of LinkedList class.
        LinkedList linkedlist = new LinkedList();
        System.out.println("LinkedList: " + linkedlist + "\n");

        // size() : printing the size of linkedlist.
        System.out.println("Size of LinkedList: " + linkedlist.size() + "\n");

        // add(Object object) : inserting operation in LinkedList.
        linkedlist.add("Iron Man");
        linkedlist.add("Captain America");
        linkedlist.add("Spiderman");
        linkedlist.add("The Hulk");
        linkedlist.add("Ant Man");
        linkedlist.add(2012);
        linkedlist.add(null);
        linkedlist.add(false);
        linkedlist.add(true);
        System.out.println("LinkedList: " + linkedlist);
        System.out.println("Size of LinkedList: " + linkedlist.size() + "\n");
    }
};