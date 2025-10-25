package superkeyword;

class SuperClass{
    String name = "Elon Musk";
    
    void launchRocket(){
        System.out.println("Launching Space-X rocket");
    }
};

class SubClass extends SuperClass{
    String name = "Jeff Bezos";

    void launchRocket(){
        System.out.println("Launching Blue-Origin rocket");
    }

    void printDetails(){
        System.out.println("Name is " + name);
        launchRocket();

        System.out.println("Name is " + super.name);
        super.launchRocket();
    }
};

public class SuperKeyword{
    public static void main(String[] args){
        SubClass object = new SubClass();

        object.printDetails();
    }
};