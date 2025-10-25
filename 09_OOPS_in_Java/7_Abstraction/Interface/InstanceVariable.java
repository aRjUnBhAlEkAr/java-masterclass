package interfacepacks;

interface Interface{
    // Instance variable in interface is by Default public, static and final.
    int var = 10;

    void sayHello();
};

class InstanceVariable implements Interface{
    @Override
    public void sayHello(){
        System.out.println("Hello! " + var);
        // we cannot assign value to this variable because it is a final variable.
        // var = 100;
    }

    public static void main(String[] args){
        InstanceVariable object = new InstanceVariable();
        object.sayHello();
    }
};

