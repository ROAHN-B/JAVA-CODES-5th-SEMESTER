class Student {
    String studentName;
    int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentId);
    }

    class Exam {
        String subject;
        int marks;

        public Exam(String subject, int marks) {
            this.subject = subject;
            this.marks = marks;
        }

        public void displayExamDetails() {
            System.out.println("  Subject: " + this.subject + ", Marks: " + this.marks);
        }
    }
}

public class ReportCard{
    public static void main(String[] args) {
        Student student1 = new Student("Rohan K.", 101);

        Student.Exam exam1 = student1.new Exam("Mathematics", 95);
        Student.Exam exam2 = student1.new Exam("Physics", 92);
        Student.Exam exam3 = student1.new Exam("Chemistry", 88);

        System.out.println("--- Student Marksheet ---");
        student1.displayStudentInfo();
        
        System.out.println("\nResults:");
        exam1.displayExamDetails();
        exam2.displayExamDetails();
        exam3.displayExamDetails();
    }
}
