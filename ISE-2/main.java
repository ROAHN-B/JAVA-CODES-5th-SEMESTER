abstract class Shape{
    abstract void Area();
    abstract void display();
}

class Circle extends Shape{
    double radius;
    double area;

    Circle(double radius){
        this.radius=radius;
    }

    void Area(){
        this.area=Math.PI*radius*radius;
    }

    void display(){
        System.out.println("Area of circle: "+area);
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

    void Area(){
        this.area=length*breadth;
    }

    void display(){
        System.out.println("Area of Rectangle: "+area);
    }
}

public class main{
    public static void main(String[] arg){
        Shape c1= new Circle(5);
        Shape R1 =new Rectangle(10,5);

        c1.Area();
        c1.display();

        R1.Area();
        R1.display();

    }
}

