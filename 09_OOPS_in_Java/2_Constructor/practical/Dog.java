package practice;

public class Dog{
    private String name;
    private String color;

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args){
        Dog obj = new Dog("Tommy", "Grey");

        System.out.println("Dog name is " + obj.name + "\nDog Color is " + obj.color);
    }
};