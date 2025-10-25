package practice;

class Sports{
    void play(){
        System.out.println("This is Sport Class");
    }
};

class Football extends Sports{
    @Override
    void play(){
        System.out.println("Play Football");
    }
};

class BasketBall extends Sports{
    @Override
    void play(){
        System.out.println("Play Basket");
    }
};

class Rugby extends Sports{
    @Override
    void play(){
        System.out.println("Play Rugby");
    }
};

public class SportsDemo{
    public static void main(String[] args){
        Rugby object1 = new Rugby();
        object1.play();

        BasketBall object2 = new BasketBall();
        object2.play();

        Rugby object3 = new Rugby();
        object3.play();
    }
};