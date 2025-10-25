package practice;

interface Animal{
    void bark();
};

class Dog implements Animal{
    @Override
    public void bark(){
        System.out.println("Dog is Barking!");
    }
}

class AnimalDemo{
    public static void main(String[] args){
        Dog dog = new Dog();

        dog.bark();
    }
};