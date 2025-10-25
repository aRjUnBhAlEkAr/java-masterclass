package practice;

public class Cat{
    private String name;
    private short age;

    public Cat(){
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args){
        Cat obj = new Cat();
        System.out.println("Cat Name is " + obj.name);
        System.out.println("Cat Age is " + obj.age);
    }
};