package treeset;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetClass{
    public static void main(String[] args){
        /**
         * Ways of creating object of TreeSet class.
         - Type-1: By using the Set interface.
            Set set = new TreeSet();
         - Type-2: By using the SortedSet interface.
            SortedSet sortedset = new TreeSet();
         - Type-3: By using the NavigableSet interface.
            NavigableSet navigableset = new TreeSet();
         - Type-4: By using the TreeSet class.
            TreeSet treeset = new TreeSet();
        */
        
        // Declaration of the TreeSet class object.
        TreeSet treeset = new TreeSet();
        treeset.add("Udhishthir");
        // treeset.add(12345); //Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        // treeset.add(null); // Exception in thread "main" java.lang.NullPointerException
        treeset.add("Bheem");
        treeset.add("Arjun");
        treeset.add("Nakul");
        treeset.add("Sahdev");
        System.out.println("TreeSet: " + treeset);

        // size() : returns the size of treeset
        System.out.println(" *** size() method *** ");
        System.out.println("Size of TreeSet is " + treeset.size());
        
        // clear() : removes all the elements of treeset.
        System.out.println(" *** clear() method *** ");
        treeset.clear();
        System.out.println("TreeSet: " + treeset);

        // addAll(Collection Object) : adds existing treeset element.
        TreeSet temp = new TreeSet();
        temp.add("Udhishthir");
        temp.add("Bheem");
        temp.add("Arjun");
        
        treeset.add("Kri$na");
        treeset.add("Balram");
        treeset.add("Subhadra");

        System.out.println(" *** addAll(TreeSet object) method ***");
        System.out.println("TreeSet: " + treeset);
        treeset.addAll(temp);
        System.out.println("TreeSet: " + treeset);
    }
};