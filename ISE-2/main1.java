abstract class Employee{
    String name;
    int ID;

    abstract void calculateSalary();
    abstract void display();
}

class FullTimeEmployee extends Employee{
    double salary;
    FullTimeEmployee(String name, int ID, double salary){
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }

    void calculateSalary(){
        this.salary=salary;
    }

    void display(){
        System.out.println("Full time Employee with salary:  "+salary);
        System.out.println("name: "+name);
        System.out.println("ID: "+ID);
    }
}

class PartTimeEmployee extends Employee{
    double salary;
    PartTimeEmployee(String name, int ID, double salary){
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }

    void calculateSalary(){
        this.salary=(salary)/2;
    }

    void display(){
        System.out.println("Part time Employee with slary: "+salary);
        System.out.println("name: "+name);
        System.out.println("ID: "+ID);
    }
}


public class  main1{
    public static void main(String[] arg){
        Employee E1 = new FullTimeEmployee("Rohan", 2001, 20000);
        Employee E2= new PartTimeEmployee("laukik",2001, 30000 );

        E1.calculateSalary();
        E1.display();

        E2.calculateSalary();
        E2.display();
    }
}
