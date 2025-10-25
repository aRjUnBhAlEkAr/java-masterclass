package practice;

interface FirstInterface{
    void greet();
};

interface SecondInterface{
    void greet();
};

public class TwoInterface implements FirstInterface, SecondInterface{
    @Override
    public void greet(){
        System.out.println("Hello, Nice to meet you!");
    }

    public static void main(String[] args){
        FirstInterface firstinterface = new TwoInterface();
        firstinterface.greet();

        SecondInterface secondinterface = new TwoInterface();
        secondinterface.greet();
    }
};