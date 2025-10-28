import java.util.TreeSet;

public class EmployeeTreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> employeeNames = new TreeSet<>();

        employeeNames.add("David Lee");
        employeeNames.add("Alice Smith");
        employeeNames.add("Bob Johnson");
        employeeNames.add("Charlie Brown");
        employeeNames.add("Alice Smith");
        employeeNames.add("Bob Johnson");
        
        System.out.println("Employee names in alphabetical order (duplicates removed):");

        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
