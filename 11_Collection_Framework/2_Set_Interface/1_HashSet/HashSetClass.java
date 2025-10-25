package hashset;

import java.util.HashSet;

public class HashSetClass{
    public static void main(String[] args){
        // Set set = new HashSet();     // -> Dynamic Dispatch.    
        
        // Creating object of class HashSet.
        HashSet hashset = new HashSet();

        // add(object) : Inserting element in HashSet
        hashset.add("Lotus");
        hashset.add("Blow");
        hashset.add(true);
        hashset.add(null);
        hashset.add(false);
        hashset.add(123);
        hashset.add(134.25);
        System.out.println(hashset);

        // addAll(HashSet object) : Inserting all element of exesting HashSet
        HashSet addAllObj = new HashSet();
        addAllObj.add("Krishna");
        addAllObj.add(1000);
        addAllObj.add(153.215);
        addAllObj.add(true);
        
        System.out.println(addAllObj);
        addAllObj.addAll(hashset);
        System.out.println(addAllObj);

        // remove() : 
    }
};