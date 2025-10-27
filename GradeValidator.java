import java.util.Scanner;

public class GradeValidator {

    public void checkGrade(char grade) {
        grade = Character.toUpperCase(grade);

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            System.out.println("Valid grade provided: " + grade);
        } else {
            throw new IllegalArgumentException("Invalid grade: " + grade + ". Must be A, B, C, D, or F.");
        }
    }

    public static void main(String[] args) {
        GradeValidator validator = new GradeValidator();

        System.out.println("--- 1. Testing with a valid grade ('B') ---");
        try {
            validator.checkGrade('B');
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- 2. Testing with an invalid grade ('X') ---");
        try {
            validator.checkGrade('X');
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nProgram continues after handling exceptions.");
    }
}
