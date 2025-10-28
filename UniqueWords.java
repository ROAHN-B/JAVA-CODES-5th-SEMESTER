import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a paragraph of text:");
        String paragraph = scanner.nextLine();
        scanner.close();

        String cleanedParagraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        
        String[] words = cleanedParagraph.split("\\s+");
        
        Set<String> uniqueWords = new HashSet<>();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Here are the unique words found:");
        System.out.println(uniqueWords);
    }
}
