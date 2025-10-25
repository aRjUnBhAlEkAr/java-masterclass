package practice;

class Shape{
    void printShape(){
        System.out.println("This is Shape.");
    }
};

class RectangleShape extends Shape{
    
    void printRectangleShape(){
        System.out.println("This is Rectangle Shape.");
    }
};

class CircleShape extends Shape{
    void printCircleShape(){
        System.out.println("This is Circular shape.");
    }
};

class SquareShape extends RectangleShape{
    void printSquareShape(){
        System.out.println("Square is a Rectangle.");
    }
};
    
public class PrintShape{
    public static void main(String[] args){
        SquareShape object = new SquareShape();

        object.printSquareShape();
        object.printRectangleShape();
    }
};