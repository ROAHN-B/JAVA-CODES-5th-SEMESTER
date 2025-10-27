import java.util.*;
abstract class Employee {
    String name;
    int ID;

    Employee (String name, int ID){
        this.name=name;
        this.ID=ID;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    double monthly_salary;

    FullTimeEmployee (String name, int ID, double monthly_salary){
        super(name, ID);
        this.monthly_salary=monthly_salary;
    }

    public double calculateSalary(){
        return this.monthly_salary;
    }
    
}

class PartTimeEmployee extends Employee{
    double monthly_salary;

    PartTimeEmployee (String name, int ID, double monthly_salary){
        super(name, ID);
        this.monthly_salary=monthly_salary;
    }

    public double calculateSalary(){
        return this.monthly_salary/2;
    }
    
}

public class EmployeeClass{
    public static void main (String [] args){
        Employee E1 = new FullTimeEmployee("Rohan", 2001, 300000);
        Employee E2 = new PartTimeEmployee("OM", 3001, 200000);

        System.out.println("Full time employee salary: "+E1.calculateSalary());
        System.out.println("Part time employee: "+E2.calculateSalary());


    }
}