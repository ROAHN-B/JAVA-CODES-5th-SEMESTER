public class Rectangle {
    double length;
    double breadth;
    double area;
    double side;
    Rectangle(){
        this.length=0;
        this.breadth=0;
        this.side=0;
    }
    Rectangle (double side){
        this.side=side;
        area=this.side*this.side;
        System.out.println("Area of square is: \t"+area);
    }
    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
        area = this.length*this.breadth;
        System.out.println("Area of rectangle: \t"+ area);
    }

public static void main(String[] arg){
    Rectangle Rect = new Rectangle(3.0,4.0);
    Rectangle square = new Rectangle(6.0);
    
}

}


