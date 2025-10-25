package interfacepacks;

interface InterfaceClass{
    abstract void sayHello();
    // By default it is a abstract method.
    void sayHey();
};

class ImplementingClass implements InterfaceClass{
    @Override
    public void sayHello(){
        System.out.println("Hello, I am sayHello() method.");
    }

    @Override
    public void sayHey(){
        System.out.println("Hey, I am sayHey() method.");
    }
};

public class Interface{
    public static void main(String[] args){
        ImplementingClass object = new ImplementingClass();
        object.sayHello();
        object.sayHey();    
    }
};