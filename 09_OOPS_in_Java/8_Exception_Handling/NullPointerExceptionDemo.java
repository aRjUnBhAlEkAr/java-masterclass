package exception;

public class NullPointerExceptionDemo{

    public void message(){
        System.out.println("Hello !");
    }

    public static void main(String[] args){
        System.out.println("Line-1");
        NullPointerExceptionDemo object;
        
        try{
            object.message();
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Line-2");
    }
};