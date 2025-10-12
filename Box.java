public class Box {
    int length;
    int breadth;
    int height;
    int area;

    Box(){
        this.length=1;
        this.breadth=1;
        this.height=1;
        this.area=0;
    }

    Box(int length){
        area=length*length*length;
        System.out.println("Area of cube: \t"+area);
    }
    Box(int length,int breadth, int heigth){
        area=length*breadth*heigth;
        System.out.println("Area of cuboid: "+area);
    }

    public static void main(String[] arg){
        Box B1= new Box(3);
        Box B2= new Box(3,4,5); 
    }
    
}
