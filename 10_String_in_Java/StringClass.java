/**
 * Date: 28-04-2025.
 * String in Java:
 * - String is class in java.
 * - String is final class in java.
 * - Object of String class is Immutable.
 * - String class is part of java.lang package.
 * 
 * Methods of String class:
 * - public boolean isEmpty();
 * - public boolean isBlank();
 * - public boolean equalsIgnoreCase(String str);
 * - public String[] split(String);
 * - public String valueOf(int number);
 * - public char[]  toCharArray(String str);
 * - public char charAt(int index) 
 */

// package declaration
package string;

// Definition of the class
public class StringClass{
    // definition of the main() method.
    public static void main(String[] args){
        System.out.println(" *** String Class in Java *** ");
        String string = "The Kiran Academy";
        System.out.println("String: " + string);
        System.out.println("Length of String -> object.length() : " + string.length());
        System.out.println("char at Index -> object.charAt(index_value) : " + string.charAt(0));

        String str_obj1 = "String";
        String str_obj2 = "String";
        System.out.println("str_obj1 == str_obj2 : " + (str_obj1==str_obj2));
        System.out.println("str_obj1.equals(str_obj2) : " + str_obj1.equals(str_obj2));
        System.out.println("str_obj1: " + str_obj1.hashCode() + " str_obj2: " + str_obj2.hashCode());

        String obj1 = new String("Hello");
        String obj2 = new String("Hello");
        System.out.println("obj1 == obj2 : " + (obj1==obj2));
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
        System.out.println("obj1: " + obj1.hashCode() + " obj2: " + obj2.hashCode());
    }
};