package protectedam;

public class ProtectedMain{
    public static void main(String[] args){
        ProtectedAM object = new ProtectedAM();

        object.getProperties("Arjun Pandu Kuru", 7, 98.98);
        object.printProperties();
    }
};