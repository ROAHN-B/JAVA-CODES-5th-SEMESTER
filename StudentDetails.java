import java.util.*;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Student implements Printable, Showable{
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks){
        this.name=name;
        this.rollNo = rollNo;
        this.marks=marks;
    }
    public void print(){
        System.out.println("Printing student details: ");
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+rollNo);
        System.out.println("Marks: "+marks);
    }

    public void show(){
        System.out.println("Showing details of the student.");
    }

}
public class StudentDetails{
    public static void main(String[] arg){
        Student s= new Student("Rohan",06,97.5);
        s.print();
        s.show();

    }
}