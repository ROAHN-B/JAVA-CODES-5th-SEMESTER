import college.Students.Student;

public class Test {
    public static void main(String[] arg){
        Student s1 = new Student();
        System.out.println("name of student: "+s1.name);

        // System.out.println("Age of student: " +s1.age);
        // Accessing protected member →  Not allowed outside package (unless subclass)
        // System.out.println("Age (protected): " + s.age);  // ERROR

        // Accessing private member →  Not allowed
        // System.out.println("Marks (private): " + s.marks); // ERROR

        // But we can access private through public method

        s1.showmarks();
    }

    
}
