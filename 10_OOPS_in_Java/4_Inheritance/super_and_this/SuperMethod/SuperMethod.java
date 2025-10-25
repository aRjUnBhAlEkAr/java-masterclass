package supermethod;

class SuperClass{
    public SuperClass(){
        System.out.println("This is a Constractor of Super Class");
    }

    public SuperClass(int a){
        System.out.println("This is a Parameterized Constructor of Super Class");
    }
};

class SubClass extends SuperClass{
    public SubClass(){
        super(20);
        System.out.println("This is a Constructor of Sub Class");
    }
};

public class SuperMethod{
    public static void main(String[] args){
        SubClass object = new SubClass();
    }
};