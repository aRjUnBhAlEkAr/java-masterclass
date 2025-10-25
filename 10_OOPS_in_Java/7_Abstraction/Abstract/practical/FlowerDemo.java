package practice;

abstract class Flower{
    String name;
    String color;
    boolean smell;
    boolean containFork;

    public Flower(){

    }

    public Flower(String name, String color, boolean smell, boolean containFork){

    }

    abstract boolean smell();
    abstract String color();
    abstract boolean containFork();
};

class Rose extends Flower{
    public Rose(){

    }  

    public Rose(String name, String color, boolean smell, boolean containFork){
        this.name = name;
        this.color = color;
        this.smell = smell;
        this.containFork = containFork;
    }

    @Override
    public boolean smell(){
        return smell;
    }

    @Override
    public String color(){
        return color;
    }

    @Override
    public boolean containFork(){
        return containFork;
    }
};


class Lotus extends Flower{
    public Lotus(){

    }  

    public Lotus(String name, String color, boolean smell, boolean containFork){
        this.name = name;
        this.color = color;
        this.smell = smell;
        this.containFork = containFork;
    }

    @Override
    public boolean smell(){
        return smell;
    }

    @Override
    public String color(){
        return color;
    }

    @Override
    public boolean containFork(){
        return containFork;
    }
};


class SunFlower extends Flower{
    public SunFlower(){

    }  

    public SunFlower(String name, String color, boolean smell, boolean containFork){
        this.name = name;
        this.color = color;
        this.smell = smell;
        this.containFork = containFork;
    }

    @Override
    public boolean smell(){
        return smell;
    }

    @Override
    public String color(){
        return color;
    }

    @Override
    public boolean containFork(){
        return containFork;
    }
};

public class FlowerDemo{
    public static void main(String[] args){
        Rose rose = new Rose("Pink Rose", "Pink", true, true);
        Lotus lotus = new Lotus("BJP Lotus", "Red", false, false);  
        SunFlower sunflower = new SunFlower("Sun Flower", "Yellowise Orange", false, false);

        System.out.println("Flower Name " + sunflower.name + " color is " + sunflower.color + " flower has smell " + sunflower.smell + " does it contain forks " + sunflower.containFork);
    }
}