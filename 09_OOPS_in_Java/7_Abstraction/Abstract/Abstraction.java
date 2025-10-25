package abstraction;

// Definition of Abstract Class
abstract class AbstractClass{
    abstract void abstractMethod();

    void sayHello(){
        System.out.println("This is Method of Abstact class.");
    }
};

class Abstraction extends AbstractClass{
    // if we are extending abstract class in sub-class then we have to provide implementation to abstract methods in the sub-class. 
    @Override
    void abstractMethod(){
        System.out.println("This is overridded method of Abstract Class in Sub-Class");
    }

    public static void main(String[] args){
        Abstraction object = new Abstraction();
        object.sayHello();      
        object.abstractMethod();
    }
};