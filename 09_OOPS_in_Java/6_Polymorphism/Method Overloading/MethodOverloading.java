package methodo;

class MethodOverloadingDemo{
    void greetings(){
        System.out.println("Overleading method-1 : greetings()");
    }

    void greetings(String name){
        System.out.println("Overloading Method-2 : greetings(String name)");
    }

    void greetings(int... a){
        System.out.println("Overloading Method-3 : greetings(int... a)");
    }
};

public class MethodOverloading{
    public static void main(String[] args){
        MethodOverloadingDemo object = new MethodOverloadingDemo();

        object.greetings();
        object.greetings("Arjun");
        object.greetings(10,20,30);
    }
};