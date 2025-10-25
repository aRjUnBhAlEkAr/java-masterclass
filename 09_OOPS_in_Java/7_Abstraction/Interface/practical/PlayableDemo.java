package practice;

interface Playable{
    void play();
};

class Football implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
};

class Volleyball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Volleyball");
    }
};

class Basketball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Basketball");
    }
};

class PlayableDemo{
    public static void main(String[] args){
        Football football = new Football();
        football.play();

        Volleyball volleyball = new Volleyball();
        volleyball.play();

        Basketball basketball = new Basketball();
        basketball.play();
    }
};