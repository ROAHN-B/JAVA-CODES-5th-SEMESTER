 public class Parsing {
    public static void main(String[] args) {

        System.out.println("--- 1. Handling NumberFormatException ---");
        try {
            String str = "abc";
            System.out.println("Attempting to parse: \"" + str + "\"");
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot parse the string into an integer.");
        }

        System.out.println("\n--- 2. Handling NullPointerException ---");
        try {
            String s = null;
            System.out.println("Attempting to get length of null string...");
            System.out.println("Length: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("Error: The string variable is null.");
        } finally {
            System.out.println("This 'finally' block always runs.");
        }
    }
}
 
