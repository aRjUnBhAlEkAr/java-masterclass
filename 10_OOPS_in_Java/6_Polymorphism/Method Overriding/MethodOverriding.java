package methodor;

class SuperClass{
    // overridden method
    public void sayHello(){
        System.out.println("This is SuperClass method()");
    }
};

class SubClass extends SuperClass{
    @Override   // annotation for overridding 
    // Overridded method
    public void sayHello(){
        System.out.println("This is SubClass method()");
    }
};

class MethodOverriding{
    public static void main(String[] args){
        SubClass object = new SubClass();

        object.sayHello();
    }
};