package practice;

class Liquid{
    String state;
    int boilingpoint;

    public void boilingPointOfLiquid(){
        System.out.println("Boiling Point: " + boilingPoint);
    }

    public void stateOfLiquid(){
        System.out.println("State of Liquid: " + state);
    }
};

class Water extends Liquid{
    public Water(){

    }

    public Water(String state, int boilingpoint){
        this.state = state;
        this.boilingpoint = boilingpoint;
    }

    public void boilingPointOfLiquid(){
        System.out.println("Boiling Point of Water: " + boilingpoint);
    }

    public void stateOfLiquid(){
        System.out.println("State of Liquid: " + state);
    }
};

public class LiquidDemo{
    public static void main(String[] args){
        
    }
};