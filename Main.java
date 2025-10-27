<<<<<<< HEAD
import com.math.utils.PackageClass;

public class Main{
    public static void main(String [] args){
        PackageClass P1 = new PackageClass();
        P1.add(3,5);
        P1.multiply(4, 6);
=======
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
>>>>>>> d18ef7ec411c32cd677333d8dbfb0e145f4393a9
    }
}