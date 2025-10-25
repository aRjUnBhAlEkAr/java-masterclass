package practice;

class Rectangle{
    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void areaOfRectangle(){
        System.out.println("Area of rectangle: " + (length*breadth));
    }

    public void perimetereOfRectangle(){
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
    }
};

class Square extends Rectangle{
    double side;

    public Square(double side){
        super(10,20);
        this.side = side;
    }

    public void areaOfSqaure(){
        System.out.println("Area of Square: " + side*side);
    }

    public void perimeterOfSquare(){
        System.out.println("Perimeter of Square: " + (side*4));
    }
};

public class AreaPerimeter{
    public static void main(String[] args){
        Square square = new Square(10.2);
        System.out.println("Area and Perimeter of Rectangle: ");
        square.areaOfRectangle();
        square.perimetereOfRectangle();

        System.out.println("\nArea and Perimeter of Rectangle: ");
        square.areaOfSqaure();
        square.perimeterOfSquare();    
    }
};