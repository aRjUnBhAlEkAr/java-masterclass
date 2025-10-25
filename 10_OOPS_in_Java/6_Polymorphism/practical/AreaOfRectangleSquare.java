package practice;

import java.util.Scanner;

class Rectangle{
    // Declaration of Instance variable
    double base;
    double height;

    // Definition of the Parameterized constructor
    Rectangle(double base, double height){
        this.height = height;
        this.base = base;
    }

    // Method declaration of AreaOfRectangle() for performing operation Area of Rectangle : formula : base*height
    void AreaOfReactangle(){
        System.out.println("Area of Rectangle: " + base*height);
    }

    // Method definition of PerimeterOfRectangle() for performing operation Perimeter of Rectangle. : formula : 2(base+height)
    void PerimeterOfRectangle(){
        System.out.println("Perimeter of Rectangle: " + 2 * (base + height));
    }
};

class Square extends Rectangle{
    // Declaration of instance variable
    double side;

    Square(double side){
        super(20,30);
        this.side = side;
    }

    void AreaOfSquare(){
        System.out.println("Area of Square: " + (side*side));
    }
};

public class AreaOfRectangleSquare{
    public static void main(String[] args){
        Square object = new Square(10);
        object.AreaOfReactangle();
        object.PerimeterOfRectangle();
        object.AreaOfSquare();
    }
};