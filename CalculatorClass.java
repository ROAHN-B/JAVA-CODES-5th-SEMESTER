class Calculator {

    public int add(int a, int b) {
        System.out.println("Using add(int, int)");
        return a + b;
    }

    public float add(float a, float b) {
        System.out.println("Using add(float, float)");
        return a + b;
    }

    public String add(String a, String b) {
        System.out.println("Using add(String, String)");
        return a + b;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int intResult = myCalc.add(5, 10);
        System.out.println("Integer Result: " + intResult);
        System.out.println("---");

        float floatResult = myCalc.add(12.5f, 7.2f);
        System.out.println("Float Result: " + floatResult);
        System.out.println("---");
        
        String stringResult = myCalc.add("Hello, ", "World!");
        System.out.println("String Result: " + stringResult);
    }
}
