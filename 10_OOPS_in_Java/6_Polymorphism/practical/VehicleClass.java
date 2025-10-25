package practice;

class Vehicle{
    void startEngine(){
        System.out.println("Engine Started!");
    }

    void stopEngine(){
        System.out.println("Engine Stopped!");
    }
};

class Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Wroom Wroom");
    }

    @Override
    void stopEngine(){
        System.out.println("Fussssssss....");
    }
};

class MotorCycle extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Groom Groom");
    }

    @Override
    void stopEngine(){
        System.out.println("Furrrrr.....");
    }
};

public class VehicleClass{
    public static void main(String[] args){
        Car c = new Car();
        System.out.println("Car Starting: ");
        c.startEngine();
        c.stopEngine();

        System.out.println("MotorCycle Startig: ");
        MotorCycle m = new MotorCycle();
        m.startEngine();
        m.stopEngine();
    }
};