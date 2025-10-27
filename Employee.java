public class Employee {
    int ID;
    String name ;
    int salary;

    Employee(){
        this(0,"not specified",0);
    }
    Employee(int ID,String name){
        this(ID,"Rohan",0);
    }
    Employee(int ID, String name, int salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;

    }

    void display(){
        System.out.println("ID: \t"+ID+"\n"+"Name: \t"+name+"\n"+"salary: \t"+salary);
    }
public static void main(String[] arg){
    Employee E1= new Employee(2001,"Rohan");
    E1.display();
    Employee E2= new Employee(2001, "Rohan", 30000);
    E2.display();
}
    
}
