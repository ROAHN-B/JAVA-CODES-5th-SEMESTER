package POE;
import java.util.*;
abstract class Shape{
    public abstract double area(); 
}

class Circle extends Shape{
    double radius;
    Circle (double radius ){
        this.radius=radius;
    }
    

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}


class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle (double length,double breadth ){
        this.length=length;
        this.breadth=breadth;
    }
    
    
    public double area(){
        return this.length*this.breadth;
    }
    
}

public class CalculateArea{
    public static void main(String[] args){
        Shape C1= new Circle(2);
        Shape R1 = new Rectangle(3,4);
        
        System.out.println("Area of circle: "+C1.area());
        System.out.println("Area of rectangle: "+R1.area());
        

        
    }
}