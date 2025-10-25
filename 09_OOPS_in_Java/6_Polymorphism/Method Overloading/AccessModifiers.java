// In method overloading we can overload any type of method no matter method has which type of access modifier.
package methodo;

class AccessModifiersDemo{
    // private access modifier
    private void sayHello(){
        System.out.println("This is method-1: private void sayHello()");
    }

    // Default access modifier
    void sayHello(int num){
        sayHello();
        System.out.println("This is method-2: void sayHello(int num)");
    }

    // Protected access modifier
    protected void sayHello(double num){
        System.out.println("This is method-3: void sayHello(double num)");
    }

    // public access modifier
    public void sayHello(String name){
        System.out.println("This is Method-4 : public void sayHello(String name)");
    }
};

class AccessModifiers{
    public static void main(String[] args){
        AccessModifiersDemo object = new AccessModifiersDemo();
        
        object.sayHello(1);
        object.sayHello(1.0);
        object.sayHello("Java");
    }
}