package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap{
    public void iterateHashMap(HashMap hashmap){
        Iterator iterator = hashmap.entrySet().iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void iterateHashMapKeyValue(HashMap hashmap){
        Iterator iterator = hashmap.entrySet().iterator();

        while(iterator.hasNext()){
            Object o = iterator.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println("Key --> " + entry.getKey() + "\tValue --> " + entry.getValue());
        }
    }

    public static void main(String[] args){
        HashMap hashmap = new HashMap();

        hashmap.put(1, "One");
        hashmap.put("name", "Kri$na");
        hashmap.put(2.0, "Two Point Zero");
        hashmap.put(null, "-");
        hashmap.put(true, false);
        hashmap.put(false, true);

        IterateHashMap object = new IterateHashMap();
        object.iterateHashMap(hashmap);
        object.iterateHashMapKeyValue(hashmap);
    }
};