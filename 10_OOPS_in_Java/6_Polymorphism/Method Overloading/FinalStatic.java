package methodo;

public class FinalStatic{
    final void sayHello(){
        System.out.println("This final method");
    }

    void sayHello(int a){
        System.out.println("This method Overloads final method");
    }

    static void staticMethod(){
        System.out.println("This is Static Method");
    }

    void staticMethod(int a){
        System.out.println("This method Overloads static method.");
    }

    public static void main(String[] args){
        System.out.println("This is main() method");
        FinalStatic object = new FinalStatic();
        System.out.println("Calling Final Method and its overloading method");
        object.sayHello();
        object.sayHello(1);

        System.out.println("\nCalling Static Method and its overloading method");
        object.staticMethod();
        object.staticMethod(1);

    }

    // we can overload main()
    public static void main(String a){
        System.out.println("This method overloads main method");
    }
};