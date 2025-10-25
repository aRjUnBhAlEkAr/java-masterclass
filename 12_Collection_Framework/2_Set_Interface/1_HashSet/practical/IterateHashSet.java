package practice;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet{

    // Iterating HashSet by using Iterator Interface
    public void printHashSetMethod_1(HashSet hashset){
        System.out.println("Iterator interface... ");
        Iterator iterator = hashset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    // Itering HashSet by using for each loop.
    public void printHashSetMethod_2(HashSet hashset){
        System.out.println("For Each Loop...");
        for(Object object: hashset){
            System.out.println(object + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args){
        HashSet hashset = new HashSet();

        hashset.add(null);
        hashset.add("Krishna");
        hashset.add(true);
        hashset.add(134.25);
        hashset.add(150);
        hashset.add(false);
        System.out.println("HashSet value --> " + hashset);

        IterateHashSet iterate = new IterateHashSet();
        iterate.printHashSetMethod_2(hashset);
        iterate.printHashSetMethod_1(hashset);
    }
};