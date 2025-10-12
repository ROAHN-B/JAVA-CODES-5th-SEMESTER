public class Student {
    int rollNo;
    String name;

    Student(){
        this.rollNo=0;
        this.name=null;
    }

    Student(int rollNo, String name){
        System.out.println("Roll numbber is: \t"+rollNo);
        System.out.println("Name of student is: \t"+name);

    }

    public static void main(String[] arg){
        Student S1=new Student();
        Student s2=new Student(30, "Rohan");
    }
    
}
