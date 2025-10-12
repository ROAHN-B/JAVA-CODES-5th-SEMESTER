abstract class Shape{
    abstract void calculateArea();

   abstract void display();
}

class Circle extends Shape{
    double radius;
    double area;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    void calculateArea(){
        area= Math.PI*radius*radius;
    }
    @Override
    void display(){
        System.out.println("Area of circle: "+ area);
    }

}

class Rectangle extends Shape{
    double length;
    double breadth;
    double area;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;

    }
    @Override
    void calculateArea(){
        area = length*breadth;
    }

    @Override
    void display(){
        System.out.println("Area of rectangle: "+ area);
    }
    
}

public class Main{
    public static void main(String[] arg){
        Shape Circle = new Circle(2);
        Circle.calculateArea();
        Circle.display();
        
        Shape Rectangle = new Rectangle(4, 4);
        Rectangle.calculateArea();
        Rectangle.display();
    }
}