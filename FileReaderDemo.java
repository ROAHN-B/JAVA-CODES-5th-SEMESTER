import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {
        BufferedReader reader = null;
        String filePath = "sample.txt";

        try {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println("Attempting to read file: " + filePath);
            
            String line = reader.readLine();
            
            if (line != null) {
                System.out.println("First line of file: " + line);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing resource: " + e.getMessage());
            }
            System.out.println("File resources are being closed.");
        }
    }
}
