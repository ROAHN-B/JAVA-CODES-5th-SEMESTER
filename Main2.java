abstract class Person{
    protected String name;
    protected int ID;

    public Person(String name , int ID){
        this.name=name;
        this.ID=ID;
    }
    public abstract String  getrole();

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID:"+ID);
        System.out.println("Role: "+getrole());
    }
}

interface Login{

    boolean login(String username, String password);
    
}

class Student extends Person implements Login{
    private String username;
    private String password;

    public Student(String name, int ID, String username, String password){
        super (name, ID);
        this.username=username;
        this.password=password;
    }

    @Override
    public String getrole(){
        return "Student";
    }

    @Override
    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
}


class Faculty extends Person implements Login{
    private String username;
    private String password;

    public Faculty(String name, int ID, String username, String password){
        super (name, ID);
        this.username=username;
        this.password=password;
    }

    @Override
    public String getrole(){
        return "Faculty";
    }

    @Override
    public boolean login(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
}


public class Main2{
    public static void main(String[] arg){
        Person s1 =new Student("Rohan", 1001, "Rohan2005","Rohan@54321");
        Person F1= new Faculty ("Dr. Abhijit", 50001, "Abhijit501", "Abhijit@98812");
        
        Login studentlogin = (Login)s1;
        Login facultylogin = (Login)F1;

        if (studentlogin.login("Rohan2005", "Rohan@54321" )){
            System.out.println("Login succesful!!");
            s1.display();
        }
        else{
            System.out.println("Login failed!!");
        }

        if (facultylogin.login("Abhijit501", "Abhijit@98812")){
            System.out.println("Login succesful!!");
            F1.display();
        }
        else{
            System.out.println("Login failed!!");
        }


    } 
}