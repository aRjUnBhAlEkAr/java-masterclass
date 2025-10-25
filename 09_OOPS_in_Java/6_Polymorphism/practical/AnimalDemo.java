package practice;

class Animal{
    public void mySound(String mysound){
        System.out.println("No-sound");
    }

    public void myFood(String myfood){
        System.out.println("No-Food");
    }

    public void myLifeSpan(int mylifespan){
        System.out.println("No-LifeSpan");
    }
};

class Dog extends Animal{
    public void mySound(String mysound){
        System.out.println("Dog Sounds: " + mysound);
    }

    public void myFood(String myfood){
        System.out.println("Dog Food: " + myfood);
    }

    public void myLifeSpan(int mylifespan){
        System.out.println("Dog Life Span: " + mylifespan);
    }
};

class Tiger extends Animal{
    public void mySound(String mysound){
        System.out.println("Tiger Sounds: " + mysound);
    }

    public void myFood(String myfood){
        System.out.println("Tiger Food: " + myfood);
    }

    public void myLifeSpan(int mylifespan){
        System.out.println("Tiger Life Span: " + mylifespan);
    }
};

class Cat extends Animal{
    public void mySound(String mysound){
        System.out.println("Cat Sounds: " + mysound);
    }

    public void myFood(String myfood){
        System.out.println("Cat Food: " + myfood);
    }

    public void myLifeSpan(int mylifespan){
        System.out.println("Cat Life Span: " + mylifespan);
    }
};

public class AnimalDemo{
    public static void main(String[] arg){
        Dog dog = new Dog();
        dog.mySound("Barking");
        dog.myFood("Bone");
        dog.myLifeSpan(15);


        Tiger tiger = new Tiger();
        tiger.mySound("Roar");
        tiger.myFood("Meat");
        tiger.myLifeSpan(20);

        Cat cat = new Cat();
        cat.mySound("Meowing");
        cat.myFood("Fish");
        cat.myLifeSpan(12);
    }
}