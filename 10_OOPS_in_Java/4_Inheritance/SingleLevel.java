package inheritance;

class DerivedClass{
    void printHello(){
        System.out.println("Hello Ji !");
    }
};

public class SingleLevel extends DerivedClass{
    public static void main(String[] args){
        SingleLevel object = new SingleLevel();
        object.printHello();
    }
};