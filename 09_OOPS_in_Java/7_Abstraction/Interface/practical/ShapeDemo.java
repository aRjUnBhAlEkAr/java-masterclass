package practice;

interface Shape{
    double getArea();
};

class RectangleShape implements Shape{
    double length;
    double breadth;

    public RectangleShape(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea(){
        return length*breadth;
    }
};

class CircleShape implements Shape{
    double side;

    public CircleShape(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return side*side;
    }
};

class TriangleShape implements Shape{
    double breadth;
    double height;

    public TriangleShape(double breadth, double height){
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5*height*breadth;
    }
};

class ShapeDemo{
    public static void main(String[] args){
        RectangleShape rec = new RectangleShape(10,20);
        System.out.println("Area of Rectangle: " + rec.getArea());

        CircleShape circle = new CircleShape(5.2);
        System.out.println("Area of Circle: " + circle.getArea());
        
        TriangleShape triangle = new TriangleShape(10,20);
        System.out.println("Area of Triangle: " + triangle.getArea());

    }
}