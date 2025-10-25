package hashmap;

import java.util.HashMap;

public class HashMapClass{
    
    public static void main(String[] args){
        HashMap hashmap = new HashMap();
        System.out.println("Hashmap: " + hashmap);
        // size() : printing the size of hashmap.
        System.out.println("\n*** size() method *** ");
        System.out.println("Size of Hashmap object is " + hashmap.size());

        // put(key, value) : inserting elements in the hashamp
        System.out.println("\n*** put(key, value) method *** ");
        hashmap.put(1, "One");
        hashmap.put("name", "Kri$na");
        hashmap.put(2.0, "Two Point Zero");
        hashmap.put(null, "-");
        hashmap.put(true, false);
        hashmap.put(false, true);
        System.out.println("Hashmap: " + hashmap);
        System.out.println("Size of Hashmap object is " + hashmap.size());

        // replace(key, value) : it will replace the value at the key.
        System.out.println("\n*** replace(key, value) ***");
        hashmap.replace(null, "");
        hashmap.replace(true, 1);
        hashmap.replace(false, 0);
        System.out.println("Hashmap: " + hashmap);
    }
};