package treemap;

import java.util.TreeMap;

public class TreeMapClass{
    public static void main(String[] args){
        TreeMap treemap = new TreeMap();
    
        treemap.put(11, "One One");
        treemap.put(12, "One Two");
        // treemap.put(null, "NULL");   // -> Exception in thread "main" java.lang.NullPointerException

        // treemap.put(true, false);    // -> Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Boolean
        // treemap.put(false, true);
        treemap.put(1, true);
        System.out.println("TreeMap: " + treemap);
    }
};