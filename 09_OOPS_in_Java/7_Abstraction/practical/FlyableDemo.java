package practice;

interface Flyable{
    public void flyObj();
};

class Spacecraft implements Flyable{
    @Override
    public void flyObj(){
        System.out.println("Spacecraft Flying.");
    }
};

class Airplane implements Flyable{
    @Override
    public void flyObj(){
        System.out.println("Airplane Flying.");
    }
};

class Helicopter implements Flyable{
    @Override
    public void flyObj(){
        System.out.println("Helicopter Flying.");
    }
};

public class FlyableDemo{
    public static void main(String[] args){
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.flyObj();

        Airplane airplane = new Airplane();
        airplane.flyObj();

        Helicopter helicopter = new Helicopter();
        helicopter.flyObj();
    }
};