import java.util.HashMap;
import java.util.Map;


public class StudentMarks {

    
    private Map<String, Integer> marks;

    public StudentMarks() {
        this.marks = new HashMap<>();
    }

    
    public void addSubject(String subject, int score) {
        marks.put(subject, score);
        System.out.println("Added/Updated score for " + subject + ": " + score);
    }

    
     
    public void searchScore(String subject) {

        if (marks.containsKey(subject)) {
            int score = marks.get(subject);
            System.out.println("Score in " + subject + ": " + score);
        } else {
            System.out.println("Subject '" + subject + "' not found.");
        }
    }

    
    public void displayAllScores() {
        if (marks.isEmpty()) {
            System.out.println("No marks have been recorded yet.");
            return;
        }

        System.out.println("--- Student's Complete Mark Sheet ---");
        
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-------------------------------------");
    }

    
    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();

        
        student.addSubject("Mathematics", 95);
        student.addSubject("Physics", 90);
        student.addSubject("History", 88);

        System.out.println();

       
        student.displayAllScores();

        System.out.println();

        
        student.searchScore("Physics");     
        student.searchScore("English");    

        System.out.println();

        
        student.addSubject("Mathematics", 98);
        student.searchScore("Mathematics");
    }
}

