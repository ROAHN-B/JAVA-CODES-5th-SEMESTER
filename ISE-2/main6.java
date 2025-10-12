class Student{
    String name;
    int Rollno;

    Student(String name, int Rollno){
        this.name=name;
        this.Rollno=Rollno;
    }

    class Exam{
        String subject;
        int Marks;

        Exam(String subject, int Marks){
            this.subject=subject;
            this.Marks=Marks;
        }

        public void display(){
            System.out.println("Subject: "+subject);
            System.out.println("Marks: "+Marks);
        }
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+Rollno);
    }
}


public class main6{
    public static void main(String[] arg){
        Student s1 =new Student("Rohan", 06);
        s1.display();

        Student.Exam E1 = s1.new Exam("Maths", 56);
        Student.Exam E2 = s1.new Exam("English", 65);
        Student.Exam E3 = s1.new Exam("Science", 62);

        E1.display();
        E2.display();
        E3.display();
    }
}