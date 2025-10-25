/*      Practical-2
    Date: 10-03-2025
    Title: How to give an different name to the class.

    - If you want to give a different name to the class(not as the file name) then you have to give without using the public modifier.
    - sytax:
        class "ClassNameOtherThanFileName"{
            // code to be executed.
        };
*/


// Declaration of the package
package introduction;

// Declaration of the class without using the public access modifier, so it allows us to give different name to class, as we can see in below example.
class FirstName{
    public static void main(String[] args){
        System.out.println("Hello!\nExecution Successful!!!");
    }
};