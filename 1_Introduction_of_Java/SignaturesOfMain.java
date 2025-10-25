/*      Practical-3
    Date: 10-03-2025
    Title: Different Signatures to write an main() method in Java.
*/

// Declaration of the package
package introduction;

// Declaration of the class "SignaturesOfMain"
public class SignaturesOfMain{

    // Type-1: Basic signature of the main() method.
    public static void main(String[] args){
        System.out.println("Type-1: Welcome-to-Java");
    }
/*
    // Type-2: By changing the sequence of the modifiers.
    static public void main(String[] args){
        System.out.println("Type-2: Welcome-to-Java");
    }
*/
/*
    // Type-3: By changing the subscript notation of the array in the main() method.
    public static void main(String args[]){
        System.out.println("Type-3: Welcome-to-Java");
    }

    public static void main(String []args){
        System.out.println("Type-3: Welcome-to-Java");
    }
*/
/*
    // Type-4: By using the variable-length argument, var-argu supports to main() method by passing 3-ellipses(...(3-dot)).
    public static void main(String... args){
        System.out.println("Type-4: Welcome-to-Java");
    }
*/
/*
    // Type-5: By using the "final" keyword in the main() method signature.
    public static final void main(String[] args){
        System.out.println("Type-5: Welcome-to-Java");
    }
                        // OR
    final public static void main(String[] args){
        System.out.println("Type-5: Welcome-to-Java");
    }
*/
/*
    // Type-6: By using strictfp keyword in the main() method.
    //         Now this method is deprecated in Java
    public static strictfp void main(String[] args){
        System.out.println("Type-6: Welcome-to-Java");
    }
*/
};